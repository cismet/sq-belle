## The missing Netbeans code formatter for x-sql. 

Did you ever try to reformat your SQL on Netbeans and nothing happened?

![](https://cloud.githubusercontent.com/assets/837211/2577872/27e1bcb6-b985-11e3-910f-9ed6b7017a6a.jpg)

This plugin adds a SQL reformatting task to our favorite IDE. Just install it via it's own [Update Center](http://cismet.github.io/sq-belle/updatecenter/updates.xml) 
or by downloading the [NBM](http://cismet.github.io/sq-belle/downloads/sq-belle-1.0.nbm).

After that it works like it should:

![](https://cloud.githubusercontent.com/assets/837211/2577564/58532f28-b981-11e3-9916-19abe9b57cfe.png)

After reformatting:

![](https://cloud.githubusercontent.com/assets/837211/2577568/5d90c158-b981-11e3-8570-06bd71d29ddf.png)

The plugin uses a webservice to reformat the code. It uses a fork of the Github Project [sqlparse](https://github.com/andialbrecht/sqlparse) from @andialbrecht. 
We [forked](https://github.com/cismet/sqlparse-flask-webservice) the project and host the [service](http://sqlformat-api.cismet.de) for 
free use on a [cismet](http://www.cismet.de/en) host. Feel free to fork our or Andi's project to host your own formatting service. Just change the URL in the plugin settings to your own service 
and you're done.

![](https://cloud.githubusercontent.com/assets/837211/2578707/b1072c00-b995-11e3-8c57-e99c7ec7fcf8.png)

If you see room for improvement, just file an issue or fork the project and send us a pull-request. We would love to collaborate.


Have fun

Thorsten


