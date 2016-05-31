# yandex-translate-api-scala [![Build Status](https://travis-ci.org/Enalmada/yandex-translate-api-scala.svg?branch=master)](https://travis-ci.org/Enalmada/yandex-translate-api-scala) [![Join the chat at https://gitter.im/Enalmada/yandex-translate-api-scala](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/Enalmada/yandex-translate-api-scala?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.enalmada/yandex-translate-api-scala/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.enalmada/yandex-translate-api-scala)

Provides a simple, unofficial, Scala client API for using Yandex Translate.

Quickstart:
===========

```scala
scala> import zhmyh.yandex.api.translate.Translate

scala> import zhmyh.yandex.api.translate.Language

scala> val tr = new Translate("yandex-translate-api-key")

scala> tr.translate("Mais vale tarde do que nunca", Language.PORTUGUESE, Language.ENGLISH)
res0: scala.util.Try[String] = Success(Better late than never)

scala> tr.translate("Le meilleur est l'ennemi du bien", Language.ENGLISH)
res1: scala.util.Try[String] = Success(The best is the enemy of the good)

scala> tr.detect("Schijn bedriegt")
res2: scala.util.Try[zhmyh.yandex.api.translate.Language.Language] = Success(nl)

scala> tr.getLangs
res3: scala.util.Try[List[(zhmyh.yandex.api.translate.Language.Language, zhmyh.yandex.api.translate.Language.Language)]] = Success(List((az,ru), (be,bg), (be,cs), (be,de), (be,en), (be,es), (be,fr), (be,it), (be,pl), (be,ro), (be,ru), (be,sr), (be,tr), (bg,be), (bg,ru), (bg,uk), (ca,en), (ca,ru), (cs,be), (cs,en), (cs,ru), (cs,uk), (da,en), (da,ru), (de,be), (de,en), (de,es), (de,fr), (de,it), (de,ru), (de,tr), (de,uk), (el,en), (el,ru), (en,be), (en,ca), (en,cs), (en,da), (en,de), (en,el), (en,es), (en,et), (en,fi), (en,fr), (en,hu), (en,it), (en,lt), (en,lv), (en,mk), (en,nl), (en,no), (en,pt), (en,ru), (en,sk), (en,sl), (en,sq), (en,sv), (en,tr), (en,uk), (es,be), (es,de), (es,en), (es,ru), (es,uk), (et,en), (et,ru), (fi,en), (fi,ru), (fr,be), (fr,de), (fr,en), (fr,ru), (fr,uk), (hr,...

scala> val tr2  =  new Translate("wrong-translate-api-key")

scala> tr2.translate("Вывезет и авоська, да не знать куда", Language.ENGLISH)
res4: scala.util.Try[String] = Failure(zhmyh.yandex.api.YandexAPIException: 401: API key is invalid)
```

### Including the Dependencies

```xml
<dependency>
    <groupId>com.github.enalmada</groupId>
    <artifactId>yandex-translate-api-scala_2.11</artifactId>
    <version>1.0.0</version>
</dependency>
```
or

```scala
val appDependencies = Seq(
  "com.github.enalmada" %% "yandex-translate-api-scala" % "1.0.0"
)
```

## Versions
* 1.0.0 Initial release


## TODO
* only filter text types
* try and get it into playframework


## License

Copyright (c) 2016 Adam Lane

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

