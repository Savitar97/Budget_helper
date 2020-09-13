# Követelmény specifikáció

## 1. Jelenlegi helyzet

&nbsp;&nbsp;&nbsp;&nbsp;A koronavírus járvány okozta helyzetben, az emberek inkább az internetes vásárlásokat részesítették előnyben.
Így megnőtt az igény arra, hogy valamilyen módon képesek legyenek nyomon követni azt, hogy mennyit költenek.

&nbsp;&nbsp;&nbsp;&nbsp;Több kutatás is kimutatta, hogy az embereknek másabbak a költekezési szokásai bankkártyával, mint készpénzzel.\
Röviden elmagyarázva: az elektronikus fizetés során a számlán kívül nem lesz más kézzel fogható következmény 
a készpénzzel ellentétben, ahol ugyanis a vásárló minden egyes kiadása után látni fogja a megmaradt összeget.\
Ennek a következménye pedig általában az (a megfigyelések alapján), hogy aki készpénzt használ, az sokkal
megfontoltabban vásárol, így olyan dolgokat, amire valójában nincsen szüksége, nem vesz meg pusztán azért,
mert megtetszett neki és úgy gondolja, hogy ez is belefér még.

&nbsp;&nbsp;&nbsp;&nbsp;Sajnos sok ember ismer a környezetében olyan személyt, aki él-hal a vásárlásért vagy az online rendelésekért.
Szerintünk erről akár már függőségként is beszélhetünk.
Persze nem feltétlenül szándékosan alakították ki ezt a rossz szokást az emberek, hanem részben a fogyasztói társadalom is felelős lehet érte.

&nbsp;&nbsp;&nbsp;&nbsp;A helyzet aktualitása miatt szükségesnek érezzük, hogy egy újabb, ezzel kapcsolatban felmerülő gondot is megemlítsünk,
ami a karantén időszak miatt alakulhatott ki. A koronavírus járvány miatt sokan átkerültek home officeba jobb esetben,
rosszabban pedig elvesztették a munkájukat, de ettől még a létszükségleteknek ugyanúgy eleget kell tenni.
Néhányan lustaságból, néhányan pedig inkább óvatosságból álltak át inkább az elektronikus rendelésekre és vásárlásokra házhozszállítással.
Azonban tartós maradt ez az időszak, és sokan rászoktak erre.

&nbsp;&nbsp;&nbsp;&nbsp;Nos az otthonlét másik következménye pedig, hogy akarva akaratlanul is unatkozhatunk.\
Ilyenkor pedig mit csinál egy ember? -tehetjük fel a kérdést.
Megpróbálja elfoglalni magát, és ahhoz gyakran új dolgokra vagy tevékenységre van szükség, ami pedig újabb vásárlási hullámot eredményez.
Nem számított az, hogy azt az adott dolgot, vagy épp új hobbit meddig fogjuk folytatni (1 nap, 1 év, vagy egy életen át).

&nbsp;&nbsp;&nbsp;&nbsp;A lényege az, hogy ezeknek egy része biztosan felesleges vásárlás volt, ami nem garancia arra, hogy ez csak 1 alkalommal történt meg.
Lehetséges, hogy valaki egyszer elkezdte, aztán már nem tudott leállni vele és függővé vált.
Sokan szeretnének változtatni ezen, és különböző módszerekkel visszafogni a felesleges vásárlásokat.
Léteznek már segítségek a problémához, itt gondolhatunk például visszafogási módszerekre
(akár fizikai, akár digitális megoldással) vagy nyomonkövetési rendszerekre
(szintén lehet akár papír alapú is, jegyzettömb esetleg valamilyen szoftver).

&nbsp;&nbsp;&nbsp;&nbsp;A függőknél sajnos túl nagy szintet is ölthet a probléma, amivel az életminőségét is nagyban károsíthatja,
vagy rosszabb esetben akár a családjáét is.
Ez adott motivációt nekünk ahhoz, hogy aki függő, de szeretne segíteni magán, annak könnyíthessünk a dolgán.
Viszont ez az alkalmazás szerintünk hasznos lehet normál felhasználó számára is,
aki csak szimplán egyszerű és gyors módon szeretné követni az egyenlegét (tehát nem kell belépni külön a bank oldalára, ami plusz idő és pénz).


## 3. Jelenlegi üzleti folyamatok

&nbsp;&nbsp;&nbsp;&nbsp;Jelenleg akik nem használnak semmilyen segítséget, hanem ész nélkül szórják a pénzt, azok könnyen fizetésképtelenné válhatnak.
A mi esetünkben U.P. eddig papírcetliken vezette a pénzmozgásait, de ez számára nem volt a legjobb megoldás, mert gyakran elhagyta ezt a cetlit.
Emiatt pedig nagy problémája, hogy hosszú távon nem tudja lekövetni a kiadásait, és erre jelenthet megoldást egy digitális rendszer.


## 4. Igényelt üzleti folyamatok

- Egyedi program, tehát saját számítógépen kell futnia.
- A bevétel és a kiadások bejegyzése az adatbázisba: a felhasználó tehesse meg ezeket a lépéseket
- Az aktuális egyenleg megjelenítése.
- A költekezési statisztika megjelenítése.
    
    
## 5. A rendszerre vonatkozó szabályok

- Java, Javafx és saját adatbázis
- Java verzió: 13-as, vagy újabb


## 6. Követelménylista

- Ezzel az alkalmazással, mindig naprakész lehet a felhasználó az általa kívánt információkkal, és pontosan követni tudja a kiadásait és bevételeit.
- Mivel egyszerű hétköznapi felhasználóként szeretné használni, ezért elvárás az egyszerűség, könnyű átláthatóság/kezelés illetve a platformfüggetlenség.
- Az adattárolás saját adatbázisban működjön.
- A pénznem a felhasználó által használt legyen (ergo forint).
- Statisztikai kimutatás a költekezésekről.
- Érdemes egy későbbi esetleges funkcióbővítési kéréssel számolni.
