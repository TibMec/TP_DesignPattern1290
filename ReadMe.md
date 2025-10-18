# Patron de conception Médiateur

## Illustré avec l'exemple d'un joueur de batterie

### Pourquoi il existe, description

Le patron médiateur existe pour solutionner des projets où beaucoup de composants sont interdépendants, ce qui peut rendre le code confus. Changer une méthode d'un composant qui en implique deux à trois autres peux nécessiter d'aller fouiller dans ces autres classes pour les modifier, ce qui complexifie toute modification ultérieure. Ajouter un composant dans ce modèle peut devenir inutilement ardu.

En proposant une classe médiatrice qui centralise les transmissions de tous les composants interdépendants, on permet une régulation efficace du traffic des méthodes. Un composant n'a plus à se soucier de gérer tous les composants affectés par une de ses méthodes, il envoie juste sa requête au Médiateur qui passera le message aux concernés. La dépendance s'en trouve allégée et peut être facilement modifiée au sein du médiateur.

### Exemple dans une bibliothèque Java
Dans la librairie java.util.concurrent on trouve l'interface ScheduledExecutorService, qui contient des méthodes de médiation telles que les schedule(..params...). La classe qui l'implémente est ScheduledThreadPoolExecutor. Elle intègre plusieurs classes qui ont besoin de collaborer étroitement: les classes ScheduledFutureTask, DelayedWorkQueue et Worker (task, queue et thread).
En gérant les interactions entre "task" et "queue" par exemple, le ScheduledThreadPoolExecutor fait office de Mediator pour ces 2 classes, et leur évite un couplage direct. Ainsi "task" n'aura pas besoin d'intégrer "queue" et inversement. Pour communiquer entre elles, elles utiliseront le médiateur ScheduledThreadPoolExecutor à la place.



```mermaid
classDiagram
direction BT
class Drum {
  + Drum() 
  + BassSound() void
  + SnareSound() void
  + rest() void
}
class Hand {
  + Hand() 
  - Mediator mediator
  + setMediator(Mediator) void
  + hit() void
  + rest() void
}
class Head {
  + Head() 
  - boolean soundsGood
  - Mediator mediator
  - Song song
  + setSong(Song) void
  + play(Song) void
  + getMediator() Mediator
  + sendKick() void
  + hear() boolean
  + stop() void
  + isSoundsGood() boolean
  + sendHit() void
  + getSong() Song
  + setMediator(Mediator) void
}
class Leg {
  + Leg() 
  - Mediator mediator
  + kick() void
  + setMediator(Mediator) void
  + rest() void
}
class Main {
  + Main() 
  + main(String[]) void
}
class Mediator {
  + Mediator(Head, Hand, Leg, Drum) 
  - Hand hand
  - Head head
  - Drum drum
  - Leg leg
  + sendHit() void
  + rest() void
  + kick() void
  + hit() void
  + sendKick() void
}
class Song {
  + Song(String, int) 
  - String title
  - int length
  + getTitle() String
  + getLength() int
}

Hand "1" *--> "mediator 1" Mediator 
Head "1" *--> "mediator 1" Mediator 
Head "1" *--> "song 1" Song 
Leg "1" *--> "mediator 1" Mediator 
Main  ..>  Drum : «create»
Main  ..>  Hand : «create»
Main  ..>  Head : «create»
Main  ..>  Leg : «create»
Main  ..>  Mediator : «create»
Main  ..>  Song : «create»
Mediator "1" *--> "drum 1" Drum 
Mediator "1" *--> "hand 1" Hand 
Mediator "1" *--> "head 1" Head 
Mediator "1" *--> "leg 1" Leg 
```