# Práctica 2. Modernización MutxamelFC

## Índice
1. [Intro](#1-intro)
2. [Estructura de clases](#2-estructura-de-clases)
    - [Diagrama de clases UML](#diagrama-de-clases-uml)
    - [Código de PlantUML](#c%C3%B3digo-de-plantuml)
    - [Contenido de las clases .java](#contenido-de-las-clases-java)
3. [Programa principal (app)](#3-programa-principal-app)
4. [Entrega](#4-entrega)

### 1. Intro
> En esta práctica creamos una app para la digitalización del club de fútbol de Mutxamel.
> Para las clases tenemos una clase madre abstracta llamada FCMutxamel. Sus hijos van a ser Jugador, Entrenador, Masajista y Acompanyante.
> También tenemos dos interfaces. FuncionesIntegrantes que implementa FCMutxamel y por ende, todos su hijos. Y AccionesDeportivas que implementa Jugador y Entrenador
> Tenemos dos clases Enum. Equipos guarda las distintas categorías de equipos y Posiciones guarda las diferentes posiciones en las que pueden jugar los jugadores.
> Por último hemos creado dos excepciones. DorsalExistenteExcepcion, que se activa cuando hay más de un jugador en el mismo equipo con el mismo número. Y FormatoFormacionExcepcion, que salta cuando la formación preferida de un entrenador no coincide con el formato permitido (N-N-N)

<br>

### 2. Estructura de clases

#### Diagrama de clases UML 
