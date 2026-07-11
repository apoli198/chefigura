# CheFigura

JavaFX desktop drawing application developed to explore object-oriented design, software design patterns, test-driven development and Scrum.

## Overview

CheFigura is a desktop application for creating and editing simple geometric drawings.

Users can draw rectangles, ellipses and line segments, select existing objects and apply operations such as movement, resizing, rotation, mirroring, color changes and layer reordering.

The project was developed with a strong focus on software architecture and development methodology. Its main purpose was to apply software engineering concepts—including MVC, Command, State and Composite patterns—to a complete Java application developed incrementally through Scrum.

## Objectives

The project was designed to:

- develop a functional Java desktop application;
- apply object-oriented design principles;
- implement common software design patterns;
- separate presentation, control and business logic;
- support reversible editing operations through undo and redo;
- apply test-driven development with JUnit;
- organize team development through Scrum and iterative releases.

## Features

### Drawing tools

- Rectangle drawing
- Ellipse drawing
- Line-segment drawing
- Shape selection

### Shape editing

- Move
- Resize by a configurable factor
- Rotate by a configurable angle
- Horizontal mirroring
- Vertical mirroring
- Stretch through selection anchor points
- Stroke color selection
- Fill color selection for closed shapes

### Editing operations

- Undo
- Redo
- Copy
- Cut
- Paste
- Delete
- Move to front
- Move to back

### Canvas and project management

- Configurable drawing grid
- Grid hiding by setting its size to zero
- Zoom in
- Zoom out
- Zoom reset
- Project saving
- Project loading
- Context menus for shapes and the drawing sheet
- Keyboard shortcuts for common operations

## Architecture

The application follows the Model–View–Controller architecture.

### Model

The `model` package contains:

- drawing projects and sheets;
- geometric shapes;
- drawing and selection tools;
- command execution and history;
- shape-management logic;
- reusable value objects and JavaFX extensions.

### View

The graphical interface is defined in:

```text
src/main/resources/unisa/diem/seproject/main_view.fxml
```

The FXML view contains the drawing canvas, menus, tool controls, color selectors and transformation controls.

### Controller

`MainController` connects the JavaFX interface with the model. It manages:

- tool selection;
- mouse events;
- menu operations;
- project loading and saving;
- color changes;
- transformations;
- zoom and grid configuration.

## Design Patterns

### Command

Editing operations are represented as command objects and executed by `CommandManager`.

This supports reversible operations such as:

- drawing;
- deletion;
- movement;
- resizing;
- rotation;
- mirroring;
- color changes;
- cut and paste;
- layer reordering.

The command history is used to implement undo and redo.

### State

The active drawing tool represents the current interaction state of the application.

Concrete tool states include:

- `RectangleTool`
- `EllipseTool`
- `LineSegmentTool`
- `SelectionTool`

The selection tool also uses different anchor-point states to control movement and stretching from different directions.

### Composite

The drawing model exposes shapes through a common `Shape` abstraction.

`ShapeManager` manages collections of different concrete shapes, including:

- `RectangleShape`
- `EllipseShape`
- `LineSegmentShape`

### MVC

Business logic, user-interface definition and event handling are separated into model, FXML view and controller components.

## Technologies

- Java
- JavaFX
- FXML
- Maven
- JUnit 5
- Object-Oriented Programming
- Test-Driven Development
- Scrum
- Git

The Maven configuration uses:

- JavaFX 17.0.2
- JUnit 5.8.2
- Maven Compiler Plugin
- JavaFX Maven Plugin

The compiler target is Java 15. A JDK 17 installation is recommended for compatibility with JavaFX 17.

## Repository Structure

```text
chefigura/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── module-info.java
│   │   │   └── unisa/diem/seproject/
│   │   │       ├── MainApplication.java
│   │   │       ├── MainController.java
│   │   │       ├── Converter.java
│   │   │       └── model/
│   │   │           ├── commands/
│   │   │           ├── extensions/
│   │   │           ├── shapes/
│   │   │           ├── tools/
│   │   │           └── tools/anchors/
│   │   └── resources/
│   │       └── unisa/diem/seproject/
│   │           └── main_view.fxml
│   └── test/
│       └── java/unisa/diem/seproject/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## Requirements

- JDK 17 recommended
- Maven, or the included Maven Wrapper
- A graphical desktop environment

## Installation

Clone the repository:

```bash
git clone https://github.com/apoli198/chefigura.git
cd chefigura
```

No separate JavaFX installation is normally required because the JavaFX dependencies are managed through Maven.

## Running the Application

### Linux and macOS

```bash
./mvnw clean javafx:run
```

### Windows

```powershell
mvnw.cmd clean javafx:run
```

Alternatively, with Maven installed globally:

```bash
mvn clean javafx:run
```

The application starts through:

```text
unisa.diem.seproject.MainApplication
```

## Running the Tests

### Linux and macOS

```bash
./mvnw test
```

### Windows

```powershell
mvnw.cmd test
```

The test suite includes tests for:

- command history;
- drawing tools;
- project loading and saving;
- shape management;
- copy, cut and paste;
- deletion;
- movement;
- layer ordering;
- color changes;
- resizing;
- stretching;
- rotation;
- mirroring.

## Usage

### Drawing a Shape

1. Launch the application.
2. Select `Rectangle`, `Ellipse` or `Line Segment`.
3. Select the stroke and, where applicable, fill color.
4. Click the points required to define the shape.
5. Press `Escape` to reset the active tool operation.

### Selecting and Editing a Shape

1. Select the `Selection` tool.
2. Click a shape.
3. Use the side panel or the Edit menu to modify it.
4. Use the available anchor points to move or stretch the selected shape.

### Saving a Project

1. Open the `File` menu.
2. Select `Save`.
3. Choose a destination with the `.proj` extension.

### Loading a Project

1. Open the `File` menu.
2. Select `Load`.
3. Select an existing `.proj` file.

Project files are stored using Java object serialization.

## Keyboard Shortcuts

| Operation | Shortcut |
|---|---|
| Undo | `Ctrl/Cmd + Z` |
| Redo | `Ctrl/Cmd + Shift + Z` |
| Cut | `Ctrl/Cmd + X` |
| Copy | `Ctrl/Cmd + C` |
| Paste | `Ctrl/Cmd + V` |
| Delete | `Ctrl/Cmd + Backspace` |
| Move to front | `Ctrl/Cmd + F` |
| Move to back | `Ctrl/Cmd + B` |
| Zoom in | `Ctrl/Cmd + M` |
| Zoom out | `Ctrl/Cmd + Shift + M` |
| Reset zoom | `Ctrl/Cmd + 0` |
| Reset current tool | `Escape` |

## Scrum Development

The project was developed incrementally through multiple Scrum releases.

The development process included:

- product backlog management;
- sprint planning;
- sprint backlogs;
- sprint reviews;
- sprint retrospectives;
- burndown charts;
- incremental feature delivery;
- test-driven development from the second sprint onward.

### Project Documentation

The original Scrum documents were maintained through Google Docs and Google Sheets. Their availability depends on the original sharing permissions.

#### Initial planning

- [Product Backlog](https://docs.google.com/document/d/1o9x3ZHrCiKFyzdzuwDwU4eLUy4az84aDqUEPeN_8Hg8/edit?usp=sharing)
- [Sprint Backlog 1](https://docs.google.com/document/d/1Hxhovxr7YyvajzBjsuj5s6qUzFyGEVjyyc-NWSEW55E/edit?usp=sharing)
- [Architecture Description](https://docs.google.com/document/d/1o8qCWRSiezIrLnhqBin4rh_9KJnvN8Kyz5hhLJqm3Ek/edit?usp=sharing)

#### Sprint 1

- [Updated Product Backlog](https://docs.google.com/document/d/1BLJKF6cVJxPliRNfF4fsp9c2g663F5eifGOqOKUP7Zk/edit?usp=sharing)
- [Updated Sprint Backlog](https://docs.google.com/document/d/1DTkK0TwdU_PNtXiMamGJrplGIw2DcwVAMQ8bSixHLP8/edit?usp=sharing)
- [Sprint Review and Burndown Chart](https://docs.google.com/document/d/1RMuoDxoCA4k4N0CQGtpPQ4Jcsn38Gqyr7et6dgfPFUI/edit?usp=sharing)
- [Sprint Retrospective](https://docs.google.com/document/d/1e-XvOE9htJAhOySCZjL_f3haA7O6rEaMddonTWKBQkg/edit?usp=sharing)

#### Sprint 2

- [Updated Product Backlog](https://docs.google.com/spreadsheets/d/17QRVXPW1ftofBgPbPWpHcSAowWuxmSET3bVF413mw94/edit?usp=sharing)
- [Updated Sprint Backlog](https://docs.google.com/spreadsheets/d/1eaI30zxtapo89WUMCtskVFpp3ofvtkiusvDLnkknulo/edit?usp=sharing)
- [Sprint Review and Burndown Chart](https://docs.google.com/document/d/1ybvFik99anrwtyExqf1MKkXmWGbsclsUjQ1aOiioTxc/edit?usp=sharing)
- [Sprint Retrospective](https://docs.google.com/document/d/196TIWgOijjhhBQGV55P3bq_2bVaISD6mTw1-VtPbA9I/edit?usp=sharing)

#### Final release

- [Final Product Backlog](https://docs.google.com/spreadsheets/d/1JQqEXMT-9-BVRIgjPSkH_Teve-aJXldSJq4ArN76bs4/edit?usp=sharing)
- [Final Sprint Backlog](https://docs.google.com/spreadsheets/d/13NAZHPtvQklisnWG0vjipPbsuUnBovDaPYbL2tyB6gw/edit?usp=sharing)
- [Final Sprint Review and Burndown Chart](https://docs.google.com/document/d/1zQRefmmoUQyJA16Beg_NRkNniVS393pZKBRymz5A9uo/edit?usp=sharing)
- [Final Sprint Retrospective](https://docs.google.com/document/d/1VjU2E_3McgKw2VsRSWDRf3x5bNlKGgFR4In1bSwFd78/edit?usp=sharing)

## Known Limitations

- No precompiled application package or installer is currently distributed.
- Maven must download JavaFX and JUnit dependencies during the first build.
- Project files use native Java serialization and may become incompatible if the serialized model classes are changed.
- Loading and saving errors are currently printed to the console rather than presented through dedicated user-interface messages.
- The model supports a list of sheets, but the current interface operates on the first sheet only.
- The application has not been validated on every operating system and JDK combination.
- Some original Scrum documents are hosted externally and may become unavailable if their sharing permissions change.

## Contributors

This project was developed by:

- Alessandro Poli
- Americo Liguori
- Luigi Verolla

## Academic Context

CheFigura was developed as a group project for the **Software Engineering** course in the Master's Degree in **Information Engineering for Digital Medicine** at the University of Salerno.

The project focused on the practical application of:

- requirements analysis;
- architectural design;
- object-oriented programming;
- design patterns;
- test-driven development;
- black-box and unit testing;
- Scrum-based team development.
