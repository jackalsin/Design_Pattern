# Design Pattern

## Introduction

## Prerequisite

### Doc Generation

```bash
pip install sphinx
pip install sphinx_rtd_theme
pip install recommonmark
choco install -y make
```

## Creational Pattern

:::mermaid
classDiagram
    class MapSite
    MapSite : Enter()
    class Room
    Room: Enter()
    Room: SetSide()
    Room: GetSide()
    class Wall
    Wall: Enter()
    class Door
    Door: Enter()
    Door: IsOpen
    class Maze
    Maze: AddRoom()
    Maze: RoomNo()
    MapSite <|-- Room
    MapSite <|-- Wall
    MapSite <|-- Door
    Maze "1" --> "many" Room
:::

## Reference

### Snapshotv

:::mermaid
classDiagram
classA --|> classB : Inheritance
classC --* classD : Composition
classE --o classF : Aggregation
classG --> classH : Association
classI -- classJ : Link(Solid)
classK ..> classL : Dependency
classM ..|> classN : Realization
classO .. classP : Link(Dashed)
:::

-[Class Diag](https://mermaid-js.github.io/mermaid/#/classDiagram)
