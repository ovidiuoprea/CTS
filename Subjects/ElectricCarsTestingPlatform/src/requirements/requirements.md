## RO: Aplicație pentru o platformă digitală de testare și configurare a automobilelor electrice
Realizați o aplicație software pentru o platformă care simulează testarea, configurarea și urmărirea comportamentului automobilelor electrice în diverse scenarii.

Platforma este utilizată de producători auto pentru a genera și testa configurații de mașini electrice, pentru a simula comportamentul lor în condiții variate și pentru a monitoriza date în timp real de la senzori inteligenți.

🔵 [3p] Gestionarea serviciilor principale ale platformei
Aplicația trebuie să acceseze în permanență:

un serviciu de telemetrie,

un serviciu de control al performanței,

un serviciu de diagnosticare.

Acestea implementează interfața interfaces.PlatformModule. Nu trebuie să existe instanțe duplicate. Alte servicii pot fi adăugate în viitor.

2p. Testați folosirea serviciilor: creați 3, apoi reutilizați unul dintre ele și afișați adresa de memorie pentru a verifica identitatea.

🟢 [3p] Crearea de modele de mașini electrice
Fiecare model de mașină poate fi configurat cu:

tip baterie,

autonomie estimată,

număr de motoare,

sistem de răcire,

opțional: funcție de încărcare rapidă, pilot automat, suspensie adaptivă.

Cercetătorii trebuie să poată crea modele în mod flexibil și sigur, fără a fi necesară setarea tuturor parametrilor.

2p. Testați în main crearea a 3 modele de mașini: una completă, una simplă și una personalizată.

🟣 [3p] Simularea comportamentului senzorilor
Fiecare vehicul este dotat cu senzori de tip:

temperatură motor,

tensiune baterie,

accelerometru.

Toți senzorii implementează interfața VehicleSensor. La rulare, aplicația decide ce senzori să activeze.

2p. Testați prin activarea a 3 senzori diferiți și afisarea datelor generate.

🔴 [3p] Copierea și reglarea vehiculelor pentru simulări multiple
Odată ce un vehicul a fost creat, acesta poate fi duplicat pentru testări în condiții diferite. Copierea trebuie să păstreze componentele esențiale (baterie, motoare), dar să permită reglaje locale (temperatură, suspensii etc.).

2p. Testați clonarea unui vehicul și modificarea valorilor specifice pentru simulări multiple.

🟡 [3p] Vehicule prototip prestabilite
Platforma permite salvarea unor configurații de referință ca șabloane (ex: „city car”, „performance car”). Fiecare șablon conține o configurație fixă de componente. Se dorește generarea rapidă a unui vehicul pe baza unui astfel de șablon, fără a altera originalul.

2p. Testați generarea a 2 vehicule din același șablon cu variații diferite (culoare, anvelope etc.).

⚫ [3p] Exportul datelor vehiculului
După simulare, vehiculele pot fi exportate în formate precum:

XML

JSON

CSV

UI-ul de export permite alegerea formatului, dar nu știe nimic despre cum se face exportul în mod concret. Platforma trebuie să permită extinderea ușoară a formatelor suportate.

2p. Testați exportul unui vehicul în toate cele 3 formate.