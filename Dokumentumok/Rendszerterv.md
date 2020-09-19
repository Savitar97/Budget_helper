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

## Követelmények

### Funkcionális követelmények
- A rendszerben fontos a bevitt adatok pontos tárolása. Különben hamis adatokat juttatnánk a felhasználóhoz.
- Minden input legyen lekezelve. Ha valamelyik művelet nem sikerül arról tájékoztassuk a felhasználót. Egyébként az előző pontot szegjük meg.

### Nem funkcionális követelmények
- A grafikus felületnek letisztultnak könnyen kezelhetőnek kell lennie. A használata ne igényeljen informatikában jártas személyt.

### Jogi követelmények
- Az adatokat a felhasználó gépén tároljuk, így az adatai biztonságáért a felelősség Őt terheli.

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

Szintén innen lesz képes elérni a statisztikák menüpontot, amelyen az eddigi bevételeket és kiadásokat fogja látni napokra lebontva.

Illetve visszalépni a bejelentkező ablakra is.

- Hozzáad:

![HozzáadStage](/Dokumentumok/Resources/HozzaadStage.jpg)

A hozzáadásnál a felhasználó köteles lesz megadni összeget illetve a leírást.

Emellett szabadon megadhat hozzá további megjegyzéseket ha akar.

