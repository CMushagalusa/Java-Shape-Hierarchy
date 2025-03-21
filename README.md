# Java Shape Hierarchy Project

## 📄 Description
This project demonstrates a **Java-based object-oriented system** for modeling 2D and 3D shapes. Using abstraction, inheritance, and polymorphism, it defines a class hierarchy where each shape can compute its area, perimeter (or volume/surface area), and display a textual representation.

## 🏠 Shape Types

### ✅ Base Class: `Shape`
- Abstract class with common properties: `name`, `colour`, `is3D`

### ✅ `TwoDShape` (extends `Shape`)
- Abstract class for 2D shapes with:
  - `computeArea()`
  - `computePerimeter()`
  - `draw()`

### ✅ `ThreeDShape` (extends `Shape`)
- Abstract class for 3D shapes with:
  - `computeVolume()`
  - `computeSurfaceArea()`
  - `draw()`

## 🌈 Implemented Shapes

### 2D Shapes:
- **Circle**: Computes area and perimeter, draws ASCII circle.
- **Rectangle**: Computes area and perimeter, draws rectangle.
- **Triangle**: Computes area, draws triangle pattern.

### 3D Shapes:
- **Cylinder**: Computes volume and surface area. Placeholder `draw()` method.

## 💡 Special Class: `Polygon`
- Abstract subclass of `TwoDShape` with extra properties:
  - `numSides`, `regularity`

## ⚙️ How to Run

### 📅 Compile:
```bash
javac *.java
```

### 🔄 Run:
```bash
java TestShapes
```

## 🔍 Sample Output
```
The triangle looks like this:
       
      . 
     ... 
    ..... 
The Blue Triangle with a base of 15.0 cm and a height of 12.0 cm. 
It has an area of 90.0cm2.

The rectangle looks like this:
. . . . . . . . . . . . . . . . . . . . 
.                                     . 
.                                     . 
.                                     . 
.                                     . 
.                                     . 
.                                     . 
.                                     . 
.                                     . 
.                                     . 
The Black Rectangle has a width of 8 cm and a length of 20 cm. 
It has an area of 160 cm2 and a perimeter of 56 cm.

The White Circle with radius = 10.0cm.
* * * * * * 
...
The Blue Cylinder has a volume of ... cm3 and a surface area of ... cm2.
```

## 📝 Features
- Clean class design with reusability via abstraction
- ASCII-based drawing of geometric shapes
- Interactive input and hardcoded examples
- Organized separation of 2D vs 3D logic

## 📈 Enhancements Ideas
- Implement `draw()` for 3D shapes
- Add more shape types (e.g., square, cone, sphere)
- Add color-coded GUI using Swing or JavaFX

---
Happy coding! Contributions are welcome to expand the shape collection! 💖

Clovis Mushagalusa CIRUBAKADERHA

