# Maven Grundlagen - Übungen

## 010 - Einführung

### a) Minimale pom.xml

1. Erstellen Sie sich im Projekt ein Arbeitsverzeichnis mit Namen "exercise" (auf gleicher Ebene wie
2. diese Datei).
3. Erstellen Sie eine `pom.xml`, welche nur die minimal benötigten Inhalte enthält (Google ist Ihr Freund).
4. Probieren Sie verschiedene Plugins oder Phasen auszuführen.

### b) Mini Projekt

1. Erstellen Sie die per Maven Konvention erwarteten Verzeichnisse für den Anwendungs-Quellcode
und zusätzliche Ressourcen.
2. Legen Sie im entsprechenden Verzeichnis eine Klasse an (ohne Package). 
Diese soll eine `main()` Methode enthalten.
3. Legen Sie im entsprechenden Verzeichnis eine zusätzliche Ressource an, z.B. eine (leere) data.csv Datei.
4. Lassen Sie Maven die Anwendung kompilieren.
    - Ggf. gibt es hier eine Fehlermeldung wie z.B. "Source option 5 is no longer supported. Use 6 or later." 
   -- hierfür können Sie online nach einer Lösung suchen und benutzen, Sie müssen diese noch nicht verstehen :)
5. Schauen Sie sich den Output von Maven an.
6. Was passiert zusätzlich, wenn Sie die Anwendung paketieren lassen?

## 020 - pom.xml

### a) Packaging

1. Legen Sie das Packaging in Ihrer POM als `jar` fest -- ändert sich etwas?
2. Was passiert, wenn Sie `mvn install` aufrufen?
3. Ändern Sie das Packaging zu `pom`, erhöhen Sie die Version in Ihrer POM und rufen Sie erneut `mvn install` auf

### b) Demo-Libs

1. Installieren Sie mithilfe von Maven in Ihr lokales Maven-Repository die Bibliotheken aus den Verzeichnissen 
   - `/000.demo-lib-a`
   - `/000.demo-lib-b`

## 030 - properties

### TODO encoding auf utf-8 festlegen
 

## 040 - dependencies

### a) Projekt mit Abhängigkeiten

1. Legen Sie ein Maven Projekt mit Abhängigkeiten auf `org.apache.commons:commons-lang3:3.11`
und `org.junit.jupiter:junit-jupiter-api:5.9.0` (Junit5) an
2. Stellen Sie die Abhängigkeiten mithilfe des "dependency" Plugins dar (als Liste und als Baum)
3. Erweitern Sie das Projekt um Abhängigkeiten auf `demo-lib-A` und `demo-lib-B`. Welche transitiven 
  Abhängigkeiten kommen dazu? In welcher Version? Und welche nicht?
4. Entfernen Sie die `commons-lang3` Dependency aus ihrer POM -- was ändert sich nun bzgl. der transitiven Abhängigkeiten?
5. Lassen Sie sich mögliche Upgrades anzeigen
6. Führen Sie ein Upgrade der Dependencies aus
6. Ändern Sie die `pom.xml`, sodass die transitive Abhängigkeit `commons-io` von demo-lib-A nicht mit in 
das Projekt aufgenommen wird

### b) Testfall

1. Erstellen Sie einen einfachen Testfall und rufen Sie Maven so auf, dass der Test ausgeführt wird 
2. Was wäre ein passender Scope für die JUnit5 Dependency? 


## 050 - plugins

1. Schauen Sie sich die Dokumentation des "Maven Compiler Plugins" an. Wie kann die JDK Version des Source-Codes
gesetzt werden (Stichwort "-source argument")?
2. Konfigurieren Sie in Ihrem Projekt den Source und Target Level direkt mittels des `<configuration>` 
Blocks des Compiler-Plugins
3. Fügen Sie eine weitere Konfiguration für den Source und Target Level hinzu, der nur für die Phase "test-compile" gilt
4. Fügen Sie den 'com.soebes.maven.plugins:echo-maven-plugin:0.5.0' Plugin hinzu, sodass dieser in einer Phase
Ihrer Wahl das Projektverzeichnis auf das Terminal schreibt
