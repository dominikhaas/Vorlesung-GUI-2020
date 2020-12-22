# Vorlesung-GUI-2020
Vorlesung Grafische Benutzeroberflächen im WS 2020

## Empfohlene Voraussetzungen

Solide Kenntnisse der objektorientierten Programmierung in Java

## Lernziele und Inhalt

### Modulziele/Angestrebte Lernergebnisse

Die Studierenden erlernen die ergonomische Gestaltung, den Entwurf und die Programmierung grafischer Oberflächen. Sie können eine Oberfläche so gestalten, dass ein Benutzer damit effektiv und effizient arbeiten kann. Sie können Desktop-Technologien wie JavaFX sachgerecht anwenden. Die Studierenden verstehen die zugrundeliegenden Architekturkonzepte und können diese Technologien einordnen und bewerten. Weiter erhalten sie einen tiefen Einblick in die Grundlagen der Software-Architektur von Systemen mit graphischen Oberflächen.

Darüberhinaus erlangen die Studierenden einen Einblick in die Entwicklung von modernen Weboberflächen und transferieren die zuvor gewonnen theoretischen Erkenntnisse in dieses Umfeld.

### Inhaltsübersicht

Die Veranstaltung hat drei Schwerpunkte:
* Entwurf und Architektur von Anwendungen mit grafischer Benutzeroberfläche
* Überblick über aktuelle Technologien, Werkzeuge und Methoden für den Bau von Anwendungen mit umfangreichen Anforderungen an die Bedienbarkeit und Interaktion
* Praktisches Anwenden der erlernten Techniken im Rahmen von Übungen

Der größte Teil der Veranstaltung verwendet JavaFX. Der Schwerpunkt liegt nicht im Erlernen der eher zufälligen JavaFX-APIs, sondern in der Vermittlung der grundsätzlichen Ideen und Entwurfsmuster.
Besonderes Gewicht liegt auf Standardfragen der täglichen Praxis (z.B. der Gestaltung von Dialogen, Data-Binding, Nebenläufigkeit und Anwendungsarchitektur). Neben JavaFX werden weitere moderne Technologie wie beispielweise HTML5/JS betrachtet.
Begleitend zur Vorlesung finden Übungen zur Vertiefung der erlernten Konzepte statt.

## Übungen
### Übung 1 - Arbeitsfähigkeit herstellen
Ziel der Übung ist es für die folgenden Übungen Arbeitsfähigkeit herzustellen. Nachdem in den letzten Jahren die Heterogenität der Arbeitsgeräte (Studentenlaptops und Rechner im Labor) stark zugenommen hat, soll diese Übung sicherstellen, dass jeder Student Zugriff auf Entwicklungsumgebung und Musterlösungen hat.

<a href="docbase/U-01-Arbeitsfaehigkeit.pdf">Übungsblatt 1</a>

### Übung 2 - Komponenten und Layouts
Ziel der Übung ist es ein typisches Eingabeformular in FXML zu erstellen. Wir benutzen dazu das Werkzeug SceneBuilder.

<a href="docbase/U-02-Layout.pdf">Übungsblatt 2</a>

### Übung 3 - Events
Ziel der Übung ist es die Oberfläche aus Übung 2 mit Funktionalität zu versehen.

<a href="docbase/U-03-Events.pdf">Übungsblatt 3</a>

### Übung 4 - MVx
Ziel der Übung ist es die Oberfläche aus Übung 3 nach dem MVP Muster mit Data Binding weiterzuentwickeln.

<a href="docbase/U-04-MVx.pdf">Übungsblatt 4</a>

### Übung 5 - GUI Komponenten
Ziel der Übung ist es, eine Oberfläche bestehend aus Eingabeformular und Tabelle zu erzeugen. Die Oberfläche aus Übung 4 soll dazu als Komponente verwendet und eingebettet werden.

<a href="docbase/U-05-GUI-Komponenten.pdf">Übungsblatt 5</a>

### Übung 6 - Event-Bus
Ziel der Übung ist es die Oberfläche der vergangenen Übungen um einen Event-Bus zu erweitern. Dieser soll dazu verwendet werden eine Statusanzeige anzubinden (lose Kopplung).

<a href="docbase/U-06-Event-Bus.pdf">Übungsblatt 6</a>

### Übung 7 - Parallelität bei grafischen Oberflächen
Ziel der Übung ist es, eine (simuliert) langlaufende Aktion außerhalb des UI-Threads auszuführen. Dem Benutzer soll dabei ein Fortschritt visualisiert werden.

<a href="docbase/U-07-Parallelitaet.pdf">Übungsblatt 7</a>

### Übung 8 - Architektur
Ziel der Übung ist es, die bekannte Anwendung in eine Schichtenarchitektur zu überführen. Die Schichten werden dabei als eigene Komponenten umgesetzt. Technisch erfolgt dies als Multi-Projekt-Gradle-Build.

<a href="docbase/U-08-Architektur.pdf">Übungsblatt 8</a>


### Übung 9 - Web GUIs Teil 1
Wir entwickeln die Webversion unseres Formulars aus den vergangenen Übungen.

<a href="docbase/U-09-Web01.pdf">Übungsblatt 09</a>


### Übung 10 - Web GUIs Teil 2
Wir verwenden das HTML der letzten Übung um eine kleine laufähige Web-Version des Formulars zu erzeugen. Als Framework verwenden wir dazu Angular.

<a href="docbase/U-10-Web02.pdf">Übungsblatt 10</a>

### Übung 11 - Test
Ziel der Übungen ist es, eine Angular-Anwendung um Unit- und End-To-End-Tests zu erweitern.

<a href="docbase/U-11-Test.pdf">Übungsblatt 11</a>
