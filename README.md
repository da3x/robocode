# RoboCode

Ich will hier mal ein einfaches kleines RoboCode Basis Projekt starten.
Es soll neben den Bots auch die eigentliche Umgebung beinhalten, damit
man dieUmgebung direkt aus Eclipse starten und nutzen kann.

## Eclipse einrichten

Um mit dem Projekt zu starten muss dieses zuerst einmal ausgecheckt bzw.
geclont werden. Danach kann man es direkt als "Existing Maven Project" in
Eclipse importieren und alle notwendigen Strukturen sollten ohne große
Probleme zusammengestellt werden.

## RoboCode UI

Um später die Bots gegeneinander antreten zu lassen, muss man das
eigentliche RoboCode UI starten. Dazu gibt es die `robocode.sh` im
Root des Verzeichnisses. Unter macOS oder Linux kann man diese direkt
im Terminal ausführen und voila – das UI erscheint.

### Einstellungen

Damit das RoboCode UI zur Laufzeit die eigenen Bots findet, muss man
den Pfad zum Projekt in den Einstellungen hinterlegen:

![Settings](screens/2019-02-20%20at%2015.26.png) 

Alternativ kann man versuchen, in der `config/robocode.properties` den
folgenden Eintrag zu hinterlegen:

`robocode.options.development.path=.`

Ob dieser dauerhaft erhalten bleibt, kann ich aber noch nicht sagen.

### Let's go!

Danach kann man über das Menü einen neuen Kampf starten und die Bots
einzeln oder auch mehrfach hinzufügen.

![Battle](screens/2019-02-20%20at%2015.27.png) 
