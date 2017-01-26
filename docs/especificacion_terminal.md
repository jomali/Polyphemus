
# Especificación de RetroTerminal

**Constantes:**
+ *DEFAULT_FOREGROUND_COLOR* : Color
+ *DEFAULT_BACKGROUND_COLOR* : Color
+ *DEFAULT_EMPHASIS_COLOR* : Color

**Constructores:**
+ RetroTerminal(width : int, height : int, foregroundColor : Color, backgroundColor : Color)
+ RetroTerminal(width : int, height : int)

**Escritura de caracteres:**
- write(alignment : Alignment, character : char, x : int, y : int, foregroundColor : Color, backgroundColor : Color)

**Escritura de cadenas (esquina superior izquierda como referencia):**
+ write(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ write(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ write(x : int, y : int, text : String, foregroundColor : Color)
+ write(x : int, y : int, text : String)
+ writeTopLeft(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeTopLeft(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeTopLeft(x : int, y : int, text : String, foregroundColor : Color)
+ writeTopLeft(x : int, y : int, text : String)
+ writeTL(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeTL(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeTL(x : int, y : int, text : String, foregroundColor : Color)
+ writeTL(x : int, y : int, text : String)

**Escritura de cadenas (centro superior como referencia):**

+ writeTopCenter(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeTopCenter(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeTopCenter(x : int, y : int, text : String, foregroundColor : Color)
+ writeTopCenter(x : int, y : int, text : String)
+ writeTC(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeTC(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeTC(x : int, y : int, text : String, foregroundColor : Color)
+ writeTC(x : int, y : int, text : String)

**Escritura de cadenas (esquina superior derecha como referencia):**

+ writeTopRight(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeTopRight(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeTopRight(x : int, y : int, text : String, foregroundColor : Color)
+ writeTopRight(x : int, y : int, text : String)
+ writeTR(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeTR(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeTR(x : int, y : int, text : String, foregroundColor : Color)
+ writeTR(x : int, y : int, text : String)

**Escritura de cadenas (centro izquierda como referencia):**

+ writeMiddleLeft(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeMiddleLeft(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeMiddleLeft(x : int, y : int, text : String, foregroundColor : Color)
+ writeMiddleLeft(x : int, y : int, text : String)
+ writeML(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeML(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeML(x : int, y : int, text : String, foregroundColor : Color)
+ writeML(x : int, y : int, text : String)

**Escritura de cadenas (centro como referencia):**

+ writeMiddleCenter(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeMiddleCenter(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeMiddleCenter(x : int, y : int, text : String, foregroundColor : Color)
+ writeMiddleCenter(x : int, y : int, text : String)
+ writeMC(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeMC(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeMC(x : int, y : int, text : String, foregroundColor : Color)
+ writeMC(x : int, y : int, text : String)

**Escritura de cadenas (centro derecha como referencia):**

+ writeMiddleRight(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeMiddleRight(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeMiddleRight(x : int, y : int, text : String, foregroundColor : Color)
+ writeMiddleRight(x : int, y : int, text : String)
+ writeMR(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeMR(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeMR(x : int, y : int, text : String, foregroundColor : Color)
+ writeMR(x : int, y : int, text : String)

**Escritura de cadenas (esquina inferior izquierda como referencia):**

+ writeBottomLeft(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeBottomLeft(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeBottomLeft(x : int, y : int, text : String, foregroundColor : Color)
+ writeBottomLeft(x : int, y : int, text : String)
+ writeBL(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeBL(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeBL(x : int, y : int, text : String, foregroundColor : Color)
+ writeBL(x : int, y : int, text : String)

**Escritura de cadenas (centro inferior como referencia):**

+ writeBottomCenter(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeBottomCenter(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeBottomCenter(x : int, y : int, text : String, foregroundColor : Color)
+ writeBottomCenter(x : int, y : int, text : String)
+ writeBC(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeBC(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeBC(x : int, y : int, text : String, foregroundColor : Color)
+ writeBC(x : int, y : int, text : String)

**Escritura de cadenas (esquina inferior derecha como referencia):**

+ writeBottomRight(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeBottomRight(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeBottomRight(x : int, y : int, text : String, foregroundColor : Color)
+ writeBottomRight(x : int, y : int, text : String)
+ writeBR(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color, emphasisColor : Color)
+ writeBR(x : int, y : int, text : String, foregroundColor : Color, backgroundColor : Color)
+ writeBR(x : int, y : int, text : String, foregroundColor : Color)
+ writeBR(x : int, y : int, text : String)

**Escritura de columnas:**
+ column()

**Escritura de filas:**
+ row()

**Rellenado:**
+ clear()

