1. Factory:
 - fabricile noastre nu pot tine pasul cu...
 - orice adaugare / modificare distruge linia de productie (invalideaza crearea de obiecte)
 - trebuie implementat ceva care sa decupleze schimbarile de crearea de obiecte.
 - toate caracteristicile extind clasa abstracta AFeature (aceeasi "familie" de obiecte)
Incerc sa fac si Simple Factory si Factory Method

2. Singleton
 - o singură conexiune partajata de toti cei care au un telefon
 - lazy - nu vrem sa irosim resurse, desi cred ca merge si eager

3. Singleton registry
 - furnizor care ofera un set de conexiuni
 - fiecare conexiune va fi unica in felul ei

4. Builder
 - trebuie implementat ceva care sa creeze telefoane in functie de nevoile clientului
 - odata ce un telefon a fost creat, nu se mai poate modifica
 - toate telefoanele vor avea cel putin un identificator si o versiune - atributele obligatorii din builder, restul sunt optionale