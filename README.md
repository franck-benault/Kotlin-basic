# Kotlin-basic
Resources about about Kotlin language for java developper basic level

# Kotlin introduction

this is a simple introduction of kotlin for java backend developers...

Kotlin works fine with all java libraries.

## Goal of Kotlin
The goal of Kotlin is to be an alternative of Java, "pragmatic new language" 
* more concise
* more productive
* safer

## Statistic about Kotlin

*Tiobe index on Kotlin*

|         | rank |                                      |
| ------- | ---- | ------------------------------------ | 
| 07/2019 | 43   | 0,192%                               |
| 06/2019 | 40   | 0,237%                               |
| 05/2019 | 39   | 0,305%                               |
| 04/2019	| 35   | 0,337%                               | 
| 03/2019	| 39   | 0,288%                               |
| 02/2019	| 38   | 0,225%                               |
| 08/2018	| 43   |                                      |
| 07/2018	| 48   |                                      |
| 06/2018	| 49   |                                      |
| 05/2018	| 49   |                                      |
| 04/2018	| 49   |                                      |
| 06/2017	| 43   | (Google official support for Kotlin) |
| 05/2017	| 80   |                                      |

*PYPL*
This index is based on search done on Google related to the tuturial
http://pypl.github.io/PYPL.html

| World   |     |        |
| ------- | --- | ------ | 
| 06/2019 | 13e | 1,4%   |

With this index it is possible to filter per country. For France we have https://pypl.github.io/PYPL.html?country=FR

| France  |     |        |
| ------- | --- | ------ | 
| 06/2019 | 11e | 2,28%  |


*Github*

https://www.benfrederickson.com/ranking-programming-languages-by-github-users/

Kotlin =15e 	1,28% (juin 2019)

Kotlin is among 'language to learn' in 2018.

## Target platform
two main target platforms
* server side
* Android

## IDE
* online sandbox https://play.kotlinlang.org/ for simple tests
* Eclipse
* Intellij IDEA (best solution)

## Kotlin primary traits

### Statically typed
The type of a variable is known at compile time.

### Functional and object oriented
First-class functions
Immutability

## Concise syntaxe and succint code
### No semi-column
no more semi column needed anymore (except enum)
### No checked exception
In Kotlin there is no differences between checked and unchecked exceptions.

# Resources 
## From Jetbrain
* https://play.kotlinlang.org/ 
* https://play.kotlinlang.org/koans/overview (exercises)

## MOOC
Jetbrain (Udacity free)
* Kotlin for Java developers
https://www.class-central.com/course/coursera-kotlin-for-java-developers-12184
* Kotlin for Android developper
https://www.class-central.com/course/udacity-kotlin-for-android-developers-9699

### Coursera
https://www.coursera.org/learn/kotlin-for-java-developers

## Kotlin conf
You can see the video of the two first Kotlin conference (2017 and 2018):
* https://kotlinconf.com/2017/
* https://kotlinconf.com/2018/

# Examples
## 00 HelloWorld
simple example which print a message to the console
## 01 Kotlin basic
### mutable and immutable variables
* val (from value) immutable reference
* var (from variable) mutable reference
## 02 Data class
auto generated methods
* toString
* equals and hashCode
* componentN
* copy

## 03 basic test with Kotlin
Kotlin loves JUnit5 (not Junit4 !)

