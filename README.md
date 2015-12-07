# scala-test-app
## Вопросы
#### 1. Что понравилось больше?

Особой разницы не ощутил, т.к. ничего особо не делал. Отмечу только что в `sbt` билд файл наглядней выглядит и буков меньше.

#### 2. Что такое pom.xml?

Это ядро проекта, где прописываются все зависимости и конфигурации. Для других двух аналог "пом" выглядит вот так `gradle 

#### 3. Cделайте так,что б артефакт spark-testing-base_2.10 не добавлялся в итоговый пакет, но был доступен при тестах. На сколько уменьшился утоговый jar файл ?

Уменьшился на несколько `mb`. У меня тут вопрос появился относительно `gradle` - в нем не понятно, как скоупы для зависимостей проставлять. т.е. если в `sbt` можно сделать  `% 'test'` то там как-то непонятно?

#### 4. Что делают флаги указанные ниже?

##### Maven scala flags description

```
<arg>-Xfatal-warnings</arg>
<arg>-Xlint</arg>
<arg>-deprecation</arg>
<arg>-explaintypes</arg>
```

`-deprecation` - показывает предупреждение и расположение устаревшего API

`-explaintypes` - объясняет тип ошибки более детально

`-Xfatal-warnings` - Останавливает компиляцию, если есть какие-то предупреждения

`-Xlint` - Включает, выключает конкретные предупреждения/рекомендации по форматированию кода
