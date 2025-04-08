## RO: Aplicație pentru un laborator de biotehnologie
Realizați o aplicație software pentru un laborator care studiază organisme modificate genetic.

3p. Laboratorul produce mostre biologice pe baza unor coduri genetice specifice. Aceste mostre pot fi de mai multe tipuri: bacterii, viruși și celule stem. Toate mostrele implementează interfața `IBiologicalSample`. În funcție de scopul experimentului, cercetătorii trebuie să poată genera rapid un anumit tip de mostră. Procesul de creare trebuie să fie flexibil și să permită adăugarea altor tipuri de mostre în viitor.

2p. Testați implementarea prin crearea a 4 mostre din tipuri diferite.

3p. Unele mostre sunt costisitoare de generat. Odată creată o mostră, cercetătorii vor să poată crea rapid clone ale acesteia pentru testare în medii diferite. Nu este acceptată copierea prin constructor. Toate clonele trebuie să păstreze caracteristicile esențiale, dar să permită modificări locale (ex: temperatura incubării).

2p. Testați clonarea unei mostre și personalizați mediul în care este testată fără a afecta mostra originală.


## EN: Application for a Biotechnology Laboratory
Develop a software application for a laboratory that studies genetically modified organisms.

3p. The laboratory produces biological samples based on specific genetic codes. These samples can be of various types: bacteria, viruses, and stem cells. All samples must implement the `IBiologicalSample` interface. Depending on the purpose of the experiment, researchers should be able to quickly generate a specific type of sample. The creation process must be flexible and allow new types of samples to be added in the future.

2p. Test the implementation by creating 4 samples of different types.

3p. Some samples are costly to generate. Once a sample is created, researchers want to rapidly create clones of it to test in different environments. Copying through constructors is not allowed. All clones must retain the essential characteristics but allow local modifications (e.g., incubation temperature).

2p. Test the cloning of a sample and personalize the environment in which it is tested, without affecting the original sample.