# parser-generator
ITMO MT#4

Генератор парсеров для LL(1) грамматик. CalculatorGrammar - пример исходного файла для задания грамматики. Сгенерированный парсер находится в gen/calculator. 
  
Для того, чтоюы использовать генератор парсеров запустите класс src/main/java/generator/Main.java и в качестве аргумента передайте полный путь до файла в заданной грамматике.
  
Задание импортов:
```
@imp {
  import lala.La;
}
```
  
Задание токенов:
```
@tokens {
LP: "[(]";
SPACE: "[ \n\r]+" -> skip;
}
```
  
Задание стартового состояния:
```
@start = E;
```
  
Задание состояний:
```
@states {
StateName [int a, int b] returns [int v]
    : StateName2 [u] #code1; code2; res.v = value;
}
```
