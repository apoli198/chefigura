# Software Engineering

Project for the "Software Engineering" course — focus on design patterns
(Command, among others) and Scrum-based development process.

## Authors

- Alessandro Poli
- Americo Liguori
- Luigi Verolla

## Contents

- `Classes.java`, `EllipseTool.java`, `LineSegmentTool.java`, `Test.java` — early/root-level source files
- `Classes/` — Command pattern implementation (`Command`, `CommandManager`, `ShapeDrawCommand`, tests)
- `changes/` — later revision of the drawing tool (controller, selection tool, FXML view)
- `uml/` — UML diagrams (project overview, shape hierarchy, tool/command interaction)

## Known issues

This is a snapshot of source files collected across different sprints, not a
single buildable Maven/Gradle project:

- Package declarations are inconsistent across files/folders: `xxx` (placeholder,
  `Classes.java`), `it.unisa.diem.se.projects.chefigura` (`Test.java`),
  `unisa.diem.swproject.*` (root tools + `Classes/`), `unisa.diem.seproject.*`
  (`changes/`). These reflect the project's naming evolving over the course
  of the sprints, not a bug.
- No build file (`pom.xml`/`build.gradle`) is included — dependencies
  (JavaFX, JUnit) must be added manually to compile.
- Being coursework centered on iterative Scrum delivery, some components may
  be incomplete or partially working, consistent with mid-sprint states.

## Not included

Scrum artifacts (product/sprint backlogs, sprint reviews and retrospectives,
burndown chart) existed only as Google Docs/Sheets shortcuts, not as
exportable files — they are not included in this repository.
