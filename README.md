# Programming –opdracht Arrays 3 - BSA Monitor

## Inleiding
Tijdens de opleiding op de Hogeschool van Amsterdam krijg een student cijfers voor de vakken en projecten die hij of zij volgt. Aan het eind van jaar 1 krijgt iedere student een bindend studieadvies (BSA). Een BSA kan negatief of positief zijn. Is het BSA positief dan is het mogelijk om de opleiding te vervolgen. Bij een negatief BSA is het niet mogelijk om de opleiding te vervolgen aan de Hogeschool van Amsterdam. Een student ontvangt een negatief BSA als hij of zij aan het einde van het eerste jaar van inschrijving minder dan 50 studiepunten heeft behaald uit de propedeuse.

Je kunt een applicatie schrijven waarbij een student de behaalde cijfers in semester 1 invoert, waarna die student een overzicht krijgt van de studievoortgang. Tevens kan de applicatie voorspellen of de student een positief of negatief BSA zal krijgen.

Ieder vak/project heeft een naam en een hoeveelheid studiepunten. Deze studiepunten ontvang je wanneer je alle bij het vak behorende toetsen (tentamen, opdrachten etc.) haalt.

De volgende tabel geeft een overzicht van de vakken en projecten die studenten in semester 1 gemeenschappelijk hebben:

| Vak | Studiepunten |
|-----|--------------|
| Project Fasten Your Seatbelts | 12 |
| Programming | 3 |
| Databases | 3 |
| Personal Skills | 2 |
| Project Skills | 2 |

Daarnaast heeft elke richting nog twee vakken van 3 punten in semester 1. Voor studenten van de richting Software Engineering zijn dat de vakken OOP1 en User Interaction.

## Stappenplan
a. Maak een nieuw Java project in IntelliJ genaamd "BsaMonitor".
b. Declareer de volgende drie arrays. Maak ze de juiste lengte, alle drie even groot.
1. Een array vakNamen waarin de namen van vakken en projecten komen. Vul de array met de namen van de vakken en projecten die bij de richting SE horen in semester 1.
2. Een array vakPunten waarin voor ieder vak de studiepunten van de vakken en projecten staan. Vul deze array met de juiste studiepunten, de volgorde van de punten moet overeenkomen met de volgorde van de vakken en projecten:
   als vakNamen[1] = "Programming" dan vakPunten[1] = 3, omdat je met het vak Programming 3 studiepunten kunt verdienen.
3. Een array vakCijfers, waarin je de cijfers die je voor elk vak behaalt zult opslaan.
   c. Gebruik een methode om het totaal aantal te behalen studiepunten te bepalen. Gebruik een toepasselijke variabele voor dit totaal. De methode heeft signature
```
public static int bepaalTotaalPunten(int[] mpPuntenRij)
```
d. Gebruik de Scanner klasse om de gebruiker voor ieder vak zijn/haar behaalde cijfer in te laten voeren. Gebruik een for-loop en sla de ingevoerde cijfers op in de array vakCijfers. Zorg ervoor dat de gebruiker alleen geldige cijfers (tussen de 1.0 en de 10.0) kan invoeren.
e. Nadat de gebruiker de cijfers heeft ingevoerd kan het programma bepalen hoeveel studiepunten je hebt gehaald voor ieder vak/project, gebaseerd op het aantal studiepunten dat je kan verdienen en het cijfer dat je hebt gehaald (of hoopt te halen). Je krijgt de bij het vak/project behorende studiepunten als je cijfer groter of gelijk is aan 5,5. Gebruik weer een for-loop en zet bij elk vak de behaalde studiepunten op 0 in de array vakPunten, als het vak niet gehaald is. Als het vak wel gehaald is, dan haal je de studiepunten wel en verandert er dus niks in de array.
f. Gebruik de methode bepaalTotaalPunten() nog eens om het totaal aantal behaalde studiepunten te bepalen. Gebruik weer een toepasselijke variabele.
g. Toon nu de resultaten per project of vak op het scherm. Gebruik dit keer de System.out.printf methode om de uitlijning van de uitvoer netjes te maken.
h. Toon tenslotte het aantal behaalde studiepunten. Als het aantal behaalde studiepunten kleiner is dan 5/6 van het totaal te behalen, dan moet de volgende melding worden afgedrukt: "PAS OP: je ligt op schema voor een negatief BSA!".

## Input/Output
Zie hier een voorbeeld van input/output van deze applicatie voor de richting BIM. Input die de gebruiker invoert is schuin en onderstreept.

```
Voer behaalde cijfers in:
Fasten Your Seatbelts: 7,5
Programming: 5,5
User Interaction: 8,1
Personal Skills: 7
Project Skills: 5
OOP 1: 8
Databases: 5,4

Vak/project         Cijfer    Behaalde punten
Fasten Your Seatbelts  7.5       12
Programming            5.5        3
User Interaction       8.1        3
Personal Skills        7.0        2
Project Skills         5.0        0
OOP 1                  8.0        3
Databases              5.4        0
Totaal behaalde studiepunten: 23/28
PAS OP: je ligt op schema voor een negatief BSA!
```

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7).