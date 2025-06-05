# JAVA PROJECT 1: Address Book

Wir haben Virtual Studio Code mit
java.vendor = Eclipse Adoptium,
java.version = 21.0.7
und
java 1.8.0 openjdk von redhat benutzt.

-----

## Annahmen
Wir gehen davon aus, dass ein Personenkontakt, in nicht ausgelassenen Feldern:
- einen Vornamen und ggf. durch Leerzeichen abgetrennte Mittelnamen hat (firstName)
- einen Nachnamen hat, der ggf. ein Doppelname ist, z.B. X-Y (lastName) 
- eine Postleitzahl hat, die numerisch ist (postalCode)
- eine Stadt hat, möglich sind auch Namen mit Bindestrich oder mehrteilige Stadtnamen
- eine Straße hat, möglich sind auch Namen mit Bindestrich oder mehrteilige Straßennamen
- und eine Hausnummer hat, die numerisch ist, also keine extra Informationen wie in z.B. 4a enthält (houseNuber).

Gleiche Annahmen nehmen wir für Firmenkontakte.
Zusätzlich gehen wir davon aus, dass der Firmenname aus beliebig vielen Teilnamen besteht und ggf. Sonderzeichen enthält.

-----

## Anleitung
