# Budget-helper projekt

## A rendszer céljai és nem céljai

- A rendszer célja, hogy a felhasználó egyszerűen követhesse költekezési szokásait, valamint azokról különböző statisztikákat kaphasson napi vagy havi bontásban.
- A rendszer lehetővé teszi, hogy a megjegyzést lehessen fűzni minden egyes kiadáshoz és bevételhez, például olyasmit, hogy mire költötte a felhasználó a pénzt (számlafizetés, buszbérlet, bevásárlás, stb.)
- Emellett a rendszerbe pénzbevételt is lehet bevinni (pl. havi fizetés, zsebpénz, ösztöndíj, stb.)
- A rendszer célja, hogy a felhasználó oszlopdiagrammos grafikonokat is megtekinthessen a költéseiről egy választható időintervallumban.
- A felhasználó a későbbiekben kedvére módosíthatja bejegyzéseit.
- A felhasználó törölhet bejegyzéseket.

- Nem kikötés, hogy a rendszer minden egyes időpillanatban a felhasználó valós egyenlegét mutassa, hiszen ez az összeg attól függ, hogy a felhasználó mindent bevisz-e a rendszerbe (pl. tegyük fel, hogy az aznapi bevásárlásról elfelejti bejegyezni az infókat).
- A rendszer nem fér hozzá a felhasználó bankszámla egyenlegéhez és nem tárol érzékeny vagy személyes adatokat.
- Minden egyes bejegyzést a felhasználó maga kell bevigyen a rendszerbe.

## Projekt terv 

A projekten négy programtervező informatikus hallgató dolgozik, ábécé sorrend szerint a következők:
- Ádám Petra
- Kun - Limberger Anett
- Orosz Máté
- Tóth Attila

### Mérföldkövek, ütemterv:
- A projekt kezdete: 2020. szeptember 7.
- A projekt határideje: 2020. szeptember 28.
- A dokumentáció elkészültének határideje: 2020 szeptember 21.

## Fizikai környezet

A szoftver JavaFX platformon fog készülni, tehát egy desktop alkalmazásról van szó, amely teljesen platformfüggetlen és nem kapcsolódik hálózathoz sem. A használt fejlesztői környezet az Intellij IDEA, az alkalmazás futtatásához Java 13-as verzió szükséges. A szoftver nem fog tartalmazni vásárolt szoftver komponenseket, teljesen open-source forrásokat használunk.

## Adatbázis terv
![Adatbázis modell](/Dokumentumok/Resources/db.png)

Ebben a táblában lesznek tárolva a felhasználó kiadásai és bevételei.

### Leírás:
- id: primary key, automatikusan generált int érték
- date: a felhasználó által bevitt bejegyzések dátuma
- amount: a bejegyzéshez tartozó pénzösszeg, int érték, amely pozitív előjelű, ha bevételről van szó és negatív, ha kiadásról
- description: varchar2 típusú leírás, amelyben a felhasználó pontosíthatja, hogy mire költötte a pénzt
- comment: varchar2 opcionális megjegyzés, ha további magyarázatot szeretne bevinni a felhasználó

## Üzleti folyamatok modellje:

![UMLDiagramm](/Dokumentumok/Resources/uml.jpg)

### Megvalósítandó üzleti folyamatok:
- Megadható legyen kezdéskor a felhasználónév.
- Megadhatóak legyenek a különböző források/bevételek összegei.
- Megadhatóak legyenek a kiadások.
- Az egyes kiadások utólag módosíthatóak és törölhetőek legyenek.
- A tranzakciók adatai és a felhasználónév adatbázisban történő tárolása.
- A tranzakciókhoz társítható legyen egy megnevezés.
- Opcionálisan hozzá lehessen adni az egyes tranzakciókhoz megjegyzést.
- A kiadás/bevétel arányról megjeleníthető legyen egy statisztika.

### Üzleti szereplők:
- Azok a személyek/felhasználók, akik használják a programot.
- Ez a mi esetünkben Ufó Petit jelenti.

### Üzleti Entitás(ok):
- User: egy objektumként lesz jelölve a felhasználó.
- Mivel Ufó Peti kérésére készítjük az applikációt, ezért itt Ő lesz az objektum.

## Követelmények

### Funkcionális követelmények
- A rendszerben fontos a bevitt adatok pontos tárolása. Különben hamis adatokat juttatnánk a felhasználóhoz.
- Minden input legyen lekezelve. Ha valamelyik művelet nem sikerül arról tájékoztassuk a felhasználót. Egyébként az előző pontot szegjük meg.
- Felhasználóbarátabb élményt nyújtson.

### Nem funkcionális követelmények
- A grafikus felületnek letisztultnak könnyen kezelhetőnek kell lennie. A használata ne igényeljen informatikában jártas személyt.
- Csak azok az adatok kerüljenek megjelenítésre, amelyekre ténylegesen szükség is van.
- Mindig az aktuális információk megjelenítése.
- Ha már töröltek egy bejegyzést, akkor az azonnal tűnjön el.
- A módosított bejegyzések módosításai rögtön legyenek elérhetőek.

### Jogi követelmények
- Az adatokat a felhasználó gépén tároljuk, így az adatai biztonságáért a felelősség Őt terheli.
- A programban felhasznált illusztrációk vagy saját készítésűek, vagy No Copyright licenccel ellátottak.

## Funkcionális tervek

### Képernyőtervek

A kezdetleges képernyőtervre vonatkozó javaslatok a következőek:
- Bejelentkezés:

![BejelentkezésiStage](/Dokumentumok/Resources/BejelentkezesStage.jpg)

A felhasználó egy név megadásával léphet tovább az applikációban.

A felvett bevételek és kiadások felvételénél ez a név fog megjelenni.

A tovább gombra kattintva navigálhatunk át az applikációra.

- Applikáció:

![ApplikációStage](/Dokumentumok/Resources/ApplikacioStage.jpg)

Az applikációra átnavigálva egy ehhez hasonló ablak fog minket fogadni.

A felhasználónak itt van lehetősége bevételek és kiadások felvételéhez, módosításához, törléséhez.

Illetve itt láthassa az eddigi bevételeket és kiadásokat.

Szintén innen lesz képes elérni a statisztikák menüpontot, amelyen az eddigi bevételeket és kiadásokat fogja látni.

Illetve visszalépni a bejelentkező ablakra is.

- Hozzáad:

![HozzáadStage](/Dokumentumok/Resources/HozzaadStage.jpg)

A hozzáadásnál a felhasználó köteles lesz megadni összeget illetve a leírást.

Emellett szabadon megadhat hozzá további megjegyzéseket ha akar.

- Statisztikák:

![StatisztikákStage](/Dokumentumok/Resources/StatisztikakStage.jpg)

Utolsó menüpontunkhoz érkeztünk ezek a statisztikák. De nyugodjunk meg nem kell matekoznunk. Ugyanis a programunk magától lefogja generálni a kellő ábrákat.

## Implementációs terv:

![Implementációsterv](/Dokumentumok/Resources/Impterv.png)

A programban perzisztencia osztályokat használunk. Ebben a Hybernatere támaszkodunk illetve a JPA DAO-ra. Egy darab entitás osztályt fogunk használni az adatok tárolására.

A main osztály lesz a felelős a program indításáért.

A controllerben fogjuk lekezelni a view és a modell közötti kapcsolatokat. A view a grafikus felület lesz vagy másnéven a GUI. Ezek fxml állományokként találhatóak meg illetve CSS-el vannak támogatva. A modell az adatbázissal fogja tartani a kapcsolatot.



## Tesztlépések dokumentálása:

- Felhasználónév input megadása betűkkel -> helyes, elfogadja, továbblép
- Felhasználónév input megadása betűkkel és számokkal -> helyes, elfogadja, továbblép
- Felhasználónév input megadása: üresen hagyva próbál a felhasználó belépni -> helyes, kiírja, hogy felhasználónév megadása kötelező
- Új bejegyzés hozzáadása összeg (szám), leírás (betű), megjegyzés (betű) formában -> helyes, berakja az adatbázisba
- Új bejegyzés hozzáadása összeg (szám), leírás (betű és szám), megjegyzés (betű) formában -> helyes, berakja az adatbázisba
- Új bejegyzés hozzáadása összeg (szám), leírás (betű), megjegyzés (betű és szám) formában -> helyes, berakja az adatbázisba
- Új bejegyzésen belül a leíráshoz és megjegyzéshez bármilyen string írható -> helyes, továbblép
