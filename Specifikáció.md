## Követelmény Specifikáció

### Az alkalmazás célja

Egy olyan alkalmazás elkészítésé ami a jól ismert "Kalandjáték Kockázat könyvek" programban való leképezése.

## "Fighting Fantasy" (forrás: Wiki)

A **Fighting Fantasy** (magyarul *Kaland Játék Kockázat* vagy *Fantázia Harcos*), egy [lapozgatós játékkönyv](https://hu.wikipedia.org/wiki/Lapozgatós_játékkönyv)-sorozat. Eredeti szerzőik [Steve Jackson](https://hu.wikipedia.org/wiki/Steve_Jackson_(játéktervező,_1951)) és [Ian Livingstone](https://hu.wikipedia.org/wiki/Ian_Livingstone), de később mások is csatlakoztak hozzájuk. A legtöbb rész a [Titánon](https://hu.wikipedia.org/w/index.php?title=Titán_(fantasy_világ)&action=edit&redlink=1), egy [fantasy](https://hu.wikipedia.org/wiki/Fantasy) világon játszódik, de vannak a sorozatban [sci-fi](https://hu.wikipedia.org/wiki/Sci-fi) és a jelenkori földön játszódó [horror](https://hu.wikipedia.org/wiki/Horror) könyvek is. Az eredeti sorozat a [Puffin Books](https://hu.wikipedia.org/w/index.php?title=Puffin_Books&action=edit&redlink=1) kiadásában jelent meg az [1980-as években](https://hu.wikipedia.org/wiki/1980-as_évek), valamint az [1990-es évek](https://hu.wikipedia.org/wiki/1990-es_évek) elején, majd a [2000-es években](https://hu.wikipedia.org/wiki/2000-es_évek) a [Wizard Books](https://hu.wikipedia.org/w/index.php?title=Wizard_Books&action=edit&redlink=1) újraindította. 

Steve Jackson önálló sorozata a *Sorcery!* (magyarul *Kaland Játék Varázslat*), mely szintén a Titánon játszódik (annak egy önálló kontinensén, az Óvilágon).

A lapozgatós könyveket egy idő után a Titán világleírása, szerepjáték és regények egészítették ki.

Magyarországon [1989](https://hu.wikipedia.org/wiki/1989)-[1992](https://hu.wikipedia.org/wiki/1992) között a [Rakéta Könyvkiadó](https://hu.wikipedia.org/w/index.php?title=Rakéta_Könyvkiadó&action=edit&redlink=1) kezdett bele a sorozatba *Kaland Játék Kockázat* címmel, majd 1992-1993 között az [Új Vénusz](https://hu.wikipedia.org/w/index.php?title=Új_Vénusz&action=edit&redlink=1) kiadó folytatta *Fantázia Harcos* névvel, majd az ezredfordulón még kiadott a [Szukits](https://hu.wikipedia.org/wiki/Szukits_Könyvkiadó) két részt.

## Koncepció

Alapvetően egy felelet választós történet alapú kalandjáték ahol a felhasználónak kell eldönteni, hogy merre szeretne tovább haladni vagy hogy éppen megtámadja a szörnyet vagy sem. A felhasználó döntései befojásolják a játék menetét, illetve maga a vak szerencse. 

## Megvalósítás

Java konzolos alkalmazás. Minden kaland egy külön fájlban letárolható és végig játszható. Bejelentkezést külső adatbázisban lesz letárolva. A játékon belül menüből lehet kiválasztani, hogy melyik kampányt szeretnénk végig játszani. Lehet karaktert készíteni, minden karakternek saját STAT blokkja van, amit a játék elején kioszthatunk. Minden játékos alap felszereléssel kezd és ahogy a kaland halad úgy fejlődik. Szörnyek és challangek legyőzése után tapasztalati ponttal lesz gazdagabb a játékos. A játék akkor ér véget, hogy ha a felhasználó karaktere teljesiti a kalandot, vagy a felhasználó karakterének élet ereje elér a nullát.

Regisztráció után minden új karakterről készülne egy bejegyzés az adatbázisba. Ez tartalmazna, a felhasználó nevet, a karakter nevet és a karakter aktuális fegyverét ,életerő értékét, speciális értékeit, és hogy hány élettöltő itallal rendelkezik. 

Ugyan erre a tematikára épülne fel a szörnyek karaktertáblája is. 