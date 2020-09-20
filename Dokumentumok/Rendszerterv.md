# Budget-helper projekt

## A rendszer céljai és nem céljai

- A rendszer célja, hogy egy egyszerű áttekintést mutasson a felhsználó által költött pénzmennyiségekre akár heti, akár havi bontásban.
- A rendszer lehetővé teszi, hogy a felhasználó egy adott elköltött pénzösszeg bejegyzéséhez megjegyzést fűzhessen, például olyasmit, hogy mire költötte azt a pénzt (számlafizetés, buszbérlet, bevásárlás, stb.)
- Emellett a rendszerbe pénzbevételt is lehet bevinni (pl. havi fizetés, zsebpénz, ösztöndíj, stb.)

- Nem kikötés, hogy a rendszer minden egyes időpillanatban a felhasználó valós budget-jét mutassa, hiszen ez a felhasználó igyekezetétől függ, attól, hogy mennyire veszi komolyan költekezéseinek feljegyzését.
- A rendszer nem fér hozzá a felhasználó bankszámla egyenlegéhez és nem tárol érzékeny vagy személyes információkat.
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
