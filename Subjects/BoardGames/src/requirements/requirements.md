## RO: Aplicație pentru o platformă de creare și testare a jocurilor de societate
Realizați o aplicație software pentru o platformă digitală care permite designerilor de jocuri să creeze, cloneze și simuleze jocuri de societate (board games). Platforma este utilizată în studiouri independente, cluburi de testare și de către creatori individuali.

Scopul aplicației este de a permite definirea componentelor jocului, gestionarea logicii de joc, crearea de prototipuri, simularea rundei de joc, exportul datelor pentru partajare și gestionarea serviciilor interne ale platformei.

🔵 [3p] Gestionarea serviciilor interne
Aplicația are mai multe servicii fundamentale, cum ar fi:

un serviciu de scoring logic (stabilește câștigătorii),

un serviciu de istoric al mutărilor,

un serviciu de validare a regulilor.

Aceste servicii implementează interfața PlatformService. Nu trebuie să existe mai multe instanțe din același serviciu. Se dorește un mecanism flexibil, unde și alte servicii (ex: analiză AI) pot fi adăugate în viitor.

2p. Testați instanțierea și reutilizarea a 3 servicii. Demonstrați că aceeași instanță e folosită la apeluri repetate.

🟢 [3p] Crearea de jocuri de societate
Un joc poate avea:

titlu,

număr maxim de jucători,

durată medie (minute),

listă de componente (cărți, zaruri, jetoane etc.),

opțional: moduri de joc alternative, extensii, AI adversar.

Designerii pot crea jocuri simple sau complexe, fără a fi forțați să specifice toate opțiunile de la început.

2p. Testați crearea a 3 jocuri: unul minimalist, unul complet și unul cu o singură extensie.

🟣 [3p] Crearea dinamică a componentelor jocului
Componenta jocului poate fi:

carte,

zar,

jetoane,

planșă.

Toate implementează interfața GameComponent. Tipul este selectat la rulare de utilizator, în funcție de jocul creat. Platforma trebuie să poată fi extinsă cu alte componente fără a afecta codul principal.

2p. Testați prin generarea a 3 componente diferite.

🔴 [3p] Clonarea jocurilor pentru testare multiplă
Jocurile create pot fi clonate pentru testare în mai multe scenarii. Clonarea trebuie să creeze o copie separată, cu aceleași componente și setări, dar cu libertate de modificare (ex: schimbarea titlului, resetarea scorului).

2p. Testați clonarea unui joc și modificarea sa independent de original.

🟡 [3p] Modele de joc (template-uri prestabilite)
Platforma oferă șabloane pentru jocuri populare (ex: „deck builder”, „dice combat”, „tile placement”). Fiecare șablon are o configurație fixă. Utilizatorul poate genera un joc nou pornind de la un șablon, dar cu posibile ajustări (ex: număr jucători, extensii proprii).

2p. Testați generarea a două jocuri din același șablon, cu modificări diferite.

⚫ [3p] Exportul fișei jocului
Fiecare joc finalizat poate fi exportat pentru partajare în diverse formate:

Markdown (pentru descrieri),

PDF (pentru tipărire),

JSON (pentru API).