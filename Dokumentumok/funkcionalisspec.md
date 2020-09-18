# Funkcionális specifikáció

## A rendszer céljai és nem céljai

### A rendszer célja

- A rendszer célja, hogy egy egyszerű áttekintést mutasson a felhsználó által költött pénzmennyiségekre akár heti, akár havi bontásban.
- A rendszer lehetővé teszi, hogy a felhasználó egy adott elköltött pénzösszeg bejegyzéséhez megjegyzést fűzhessen, például olyasmit, hogy mire költötte azt a pénzt (számlafizetés, buszbérlet, bevásárlás, stb.)
- Emellett a rendszerbe pénzbevételt is lehet bevinni (pl. havi fizetés, zsebpénz, ösztöndíj, stb.)

### A rendszernek nem célja

- Nem kikötés, hogy a rendszer minden egyes időpillanatban a felhasználó valós budget-jét mutassa, hiszen ez a felhasználó igyekezetétől függ, attól, hogy mennyire veszi komolyan költekezéseinek feljegyzését.
- A rendszer nem fér hozzá a felhasználó bankszámla egyenlegéhez és nem tárol érzékeny vagy személyes információkat.
- Minden egyes bejegyzést a felhasználó maga kell bevigyen a rendszerbe.


## [Jelenlegi helyzet leírása](kovspecifikacio.md#1-jelenlegi-helyzet)


## [Vágyálom rendszer](kovspecifikacio.md#2-vágyálom-rendszer)

A megrendelőnk elképzeléseit kiegészítve, amely a hivatkozás által az alcímre kattintva érhető el. 

- Célunk egy könnyen átlátható, nem bonyolult, egyszerűen kezelhető, grafikus felülettel ellátott
alkalmazás kifejlesztése, amely segítséget nyújt a mindennapokban.

- Ennek megvalósítására az egyszerű és könnyen áttekinthető, mégis lényegretörő oszlop vagy 
vonaldiagrammokhoz kell folyamodnunk.

- Mindemellett a GUI-nak letisztultnak kell lennie, figyelnünk kell a megfelelő színek kiválasztására, minél jobban 
kivehetőek legyenek a gombok, és a későbbiekben akár már megszokásból színek alapján is képes legyen a felhasználó megjegyezni és hozzátársítani a funkciót az
adott gombhoz.

- A cél, hogy az itt leírtakhoz próbáljunk minél jobban közelíteni az alkalmazás végleges változatában.


## [Követelmény lista](kovspecifikacio.md#6-követelménylista)

## Képernyőtervek

&nbsp;&nbsp;&nbsp;&nbsp; A program indításakor a következő látvány fog elénk tárulni:

![Login Stage raw](Resources/LoginStage.png)

A felhasználó itt beírja a felhasználó nevét majd a start gombra kattintva indul el az applikáció.

![App Stage raw](Resources/AppStage.png)

Az applikáció indítását követően egy ehhez hasonló felület fog minket fogadni.

Itt az Add gombra kattintva felugrik majd egy újabb ablak, amelyben képesek vagyunk új mezőt felvenni az adatbázisunkba.

Ez az alábbi képhez hasonlóan fog kinézni(A programunkban a magyar nyelv majd lesz preferált):

![Add Stage raw](Resources/AddStage.png)

- Amount: beírhatjuk az összeget.
- Description: ez tartalmazza a leírást, tehát azt, hogy az adott összeg felvételét milyen gazdasági esemény váltotta ki.
- Comment: Itt mehetünk bele a részletekben. Lényegében a descriptionban leírtakat fejtsük ki.

A modify: itt leszünk képesek majd módosítani egy megadott mezőt az adatbázisból.

Remove: ezzel leszünk képesek törölni egy megadott mezőt az adatbázisunkból.

És a programunk utolsó funkciója a Statistics gombbal érhető majd el, amely a diagrammos megjelenítést teszi majd lehetővé.

Ez a következőhöz hasonlóképpen fog kinézni:

![Statistics Stage raw](Resources/StatisticsStage.png)


Itt majd a back gomb használatával tudunk vissza navigálni az applikációs ablakra.


## Használati esetek

&nbsp;&nbsp;&nbsp;&nbsp;A használati esetekkel demonstrálhatjuk a felhasználó, és a rendszer között végbemenő folyamatokat. \
Ez megfelelő módja annak, hogy a felhasználó tudja, mit is kellene kezdenie ezzel a programmal, vagyis hogyan kezelheti azt. \
Mivel nem szeretnénk a megrendelőt felesleges plusz információval terhelni (elég, ha csak az itt leírtakkal foglalkozik), amit egyáltalán nem biztos, hogy ért, ezért az UML diagrammot inkább a rendszertervhez csatoljuk. \
De térjünk is a lényegre. Mi az, amit Ufó Peti megtehet az alkalmazásban?
- Kezdéskor megadhat magának egy nevet (bármilyen nevet). Ezen a néven fogja tudni visszakövetni az előzményeit.
- Megadhatja a havi bevételének összegét.
- Megadhat minden egyes tranzakciót elemenként.
- Az egyes tranzakciókhoz társíthat leírást, illetve megjegyzést.
- A megjegyzés hozzáadása opcionális, tehát nem muszáj hozzá tenni.
- A bejegyzésekhez a pontos dátumot is hozzáadhatja a könnyebb nyomonkövetés érdekében.
- A bejegyzéseket utólag is módosíthatja.
- Nem csak új bejegyzést tud létrehozni, de törölhet is.
- Amennyiben szeretné, a kiadásai és a bevételei arányait statisztikai formában megtekintheti.


## Fogalom szótár




