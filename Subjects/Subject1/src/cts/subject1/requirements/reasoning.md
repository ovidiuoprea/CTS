O idee buna de implementare este o clasa abstracta pentru un preparat, din care sa derivam preparate concrete. 
Pentru ca nu e suficient timp, nu mai fac clasa abstracta, voi face o clasa concreta pentru preparat si voi crea un camp pentru numele preparatului

Voi implementa o clasa RestaurantManager, va fi singleton si va manageria lista de comenzi si asignarea acestora catre cuptor sau cuptoare.
Pentru ca prima cerinta ne asigura ca cuptorul este unic, trebuie facut singleton.
Pentru cerinta a 3a, daca cuptorul este singleton, pentru a avea mai multe cuptoare, voi reimplementa RestaurantManager astfel incat sa fie singleton registry.