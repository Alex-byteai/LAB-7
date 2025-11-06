# LAB-7

## Parte 1: Identificación de Code Smells

### Pregunta 1.1

**Code Smell:** C) Long Parameter List  
**Justificación:** Tiene demasiados parámetros, lo que complica su uso y mantenimiento.

---

### Pregunta 1.2

**Code Smell:** B) Switch Statements  
**Justificación:** Usa muchos `if` para tipos de orden, mejor sería usar polimorfismo.

---

### Pregunta 1.3

**Code Smell:** A) Large Class (God Class)  
**Justificación:** La clase hace demasiadas cosas, debería dividirse en varias.

---

### Pregunta 1.4

**Code Smell:** B) Data Clumps  
**Justificación:** Repite el mismo grupo de datos en varios métodos, se puede agrupar en una clase.

---

### Pregunta 1.5

**Code Smell:** B) Primitive Obsession  
**Justificación:** Usa enteros para representar estados, mejor usar `enum` o clases.
