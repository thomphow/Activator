# Activator
An RX updated front end to the DroidActivator project; an Open Source Android™ licensing control system. http://www.droidactivator.org/


[![Link to demo video - successful activation](https://user-images.githubusercontent.com/5545791/29630650-e162d6d2-880a-11e7-9ee1-54e5e04c722e.jpg)](https://www.youtube.com/watch?v=j0vo4ROz_wk)

[![Link to demo video - failing and trial/Later activation](https://user-images.githubusercontent.com/5545791/29630640-daf16d5e-880a-11e7-8184-91124250aef6.jpg)](https://www.youtube.com/watch?v=KUNVKJ7MhHA)

This open source (LGPL) product is derived from the DroidActivator project developed by
algos.it. The front end Android code has been almost completely replaced. 

Changes:
- The original code from 2012 relied on outdated coding practices and depricated interfaces. 
- Functionally, changes have been made to no longer validated the customer's activation data at the start of 
the application every time. Instead a date is set in the future to validate the data with the server. Silent
retries are made. Failing silent validation, the customer is informed of the failing validation retries and
final deactivation. 
- Otherwise, the functionality is the same and it makes OkHTTP calls to the same interfacing with the PHP backend.  
- A front end RX interface is now provided. The startAppOrNot() method returns a Observable<Boolean> as to whether your application 
should be started. 

See:
  https://code.google.com/archive/p/droidactivator/
  http://www.droidactivator.org/ 
  https://github.com/sferrol/droidactivator

The https://github.com/sferrol/droidactivator version was used as the initial code base but it soon became clear
that a close to total replacement of the Android code was needed. 

Please review the documentation at http://www.droidactivator.org/ for the installation of the backend PHP code.
