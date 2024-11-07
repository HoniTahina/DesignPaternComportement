JDK 11
MAVEN 3.9.*

1. Observer (Observateur)
Le pattern Observer est utilisé lorsqu'un objet doit informer plusieurs autres objets d'un changement, sans que ces objets soient directement connectés. C'est comme un système d'abonnement.

Exemple concret : Imagine que tu t'abonnes à une chaîne YouTube. Quand la chaîne publie une nouvelle vidéo, tu reçois une notification automatique. Dans cet exemple :
La chaîne YouTube est le sujet (ou l'observable).
Les abonnés (comme toi) sont les observateurs.
Quand la chaîne publie une vidéo (un changement d'état), elle notifie tous les abonnés en même temps.
Le pattern Observer permet à plusieurs objets de réagir en même temps à un événement sans être trop liés entre eux.

2. State (État)
Le pattern State est utilisé pour changer le comportement d'un objet en fonction de son état. Plutôt que de gérer des conditions complexes avec if ou switch, on délègue chaque comportement à une classe qui représente un état spécifique.

Exemple concret : Imagine un distributeur de boissons.
État 1 : Il attend qu'une pièce soit insérée. Si tu essaies de choisir une boisson avant d'insérer la pièce, il te dira d'abord de mettre de l'argent.
État 2 : Après avoir inséré la pièce, tu peux choisir ta boisson.
État 3 : Une fois la boisson sélectionnée, la machine te la distribue.
Dans ce cas, la machine change de comportement en fonction de son état (attente de pièce, sélection de boisson, distribution). Chaque état gère ses propres actions, et la machine passe d'un état à un autre automatiquement.

Le pattern State simplifie le code en organisant les comportements par état, évitant ainsi de longues conditions dans une seule classe.

3. Strategy
Le design pattern Strategy est un pattern de comportement qui permet de définir une famille d’algorithmes, de les encapsuler dans des classes séparées, et de les rendre interchangeables. L’objet qui utilise une stratégie peut changer d’algorithme dynamiquement sans modifier son propre code