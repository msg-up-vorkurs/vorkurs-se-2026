# Listen (Collections)

- Listen (von Elementen) werden in der Software-Entwicklung häufig benötigt
- Übliche Features:
  - Elemente hinzufügen/löschen
  - Angabe, ob ein Element in der Liste enthalten ist
  - Anzahl der Elemente
  - Zugriff auf alle/einzelne Elemente

## Arrays-basierte Listen (Array List)

- Arrays können die Anforderungen einer Liste nur sehr eingeschränkt erfüllen.
- Insbesondere beim Hinzufügen/Löschen von Elementen muss eine (angepasste) Kopie des kompletten Arrays erstellt werden.
- Java stellt eine fertige Implementierung einer Liste basierend auf Arrays bereit: `ArrayList`

## Verkettete Listen (Linked List)

- Elemente einer verketteten Liste enthalten ihren zu speichernden Wert (Eintrag) und einen Verweis auf das jeweils
  nächste Element der Liste.
- Die Liste selbst enthält nur einen Verweis auf das erste Element der Liste.
- Durch diese Implementierung kann insbesondere das Einfügen von Elementen am
  Anfang der Liste sehr einfach realisiert werden.
- Java stellt eine fertige Implementierung einer verketteten Liste bereit: `LinkedList`

## Vergleich ArrayList / LinkedList

| Kriterium                     | ArrayList | LinkedList                              |
|-------------------------------|-----------|-----------------------------------------|
| Speicherverbrauch             | gering    | erhöht                                  |
| Zugriff auf einzelne Elemente | direkt    | aufwändig                               |
| Einfügen                      | aufwändig | einfach (am Anfang/Ende)                |
| Löschen                       | aufwändig | im Mittel effizienter als bei ArrayList |