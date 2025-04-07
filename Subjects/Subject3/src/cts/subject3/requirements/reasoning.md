1. Prototype Factory:
 - procesul de înregistrare a unui nou jucător în cadrul clubului sportiv este un proces ce implică un consum mare de timp
 - pentru fiecare sportiv nou, există un set predefinit de antrenamente și o listă de medicamente interzise la care el este testat de anti-doping
 - Fiecare jucător își poate actualiza propria listă de antrenamente în funcție de evoluția sa sportivă - lista de antrenamente necesita deep copy

2. Singleton
 - Dacă, pe parcurs, un jucător depistează un nou tip de medicament interzis, atunci toți jucătorii trebuie să cunoască această observație nouă. 
 - Putea sa fie un atribut static, public, modificabil, nu consider ca e nevoie neaparata de singleton.