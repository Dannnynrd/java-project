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

### addConatct()
Using this interactively adds a contact. Firstly you will be asked what kind of contact you want to add.

```
What kind of contact do you want to add?
Please enter:
1. For personal conatct.
2. For business contact.
```
Enter 1 to add a personal contact or 2 to add a business contact and press ENTER to proceed.

You will then interactively create a new contact through terminal inputs.
Input prompts can be left empty abiding by the rules for skipping Strings or integers presented in the console output.

```
Adding Contact...
To skip inputs leave empty for strings or put 0 for integers and press ENTER.

Enter business name: 
Müller Co.

Enter owner's first name: Max

Enter owner's last name: Mustermann

Enter postal Code: 12345

Enter the city: Kiel

Enter the street: Haupt Str.

Enter house number: 5
```

### printContacts()
This method prints out all contacts that have been added in a readable display like the following:

```
Printing address book...

Entry 0:
        M?ller Co.
        Max Mustermann
        Haupt Str. 5, 12345 Kiel
```

### search(String s)
This method is used with the search term as a String parameter.
Then every contact is checked against the searched term and results are output.

```
Searching for 'Kiel'...

Result at contact #1:
        M?ller Co.
        Max Mustermann
        Haupt Str. 5, 12345 Kiel
```

### deleteContact()
This method interactively deletes a contact through terminal inputs.
When input is -1 the deletion action is cancelled.

```
Which contact do you want to delete? (-1 to cancel)

Printing address book...

Entry 0:
        M?ller Co.
        Max Mustermann
        Haupt Str. 5, 12345 Kiel
-1

Action cancelled.
```

```
Removed entry 0:
        M?ller Co.
        Max Mustermann
        Haupt Str. 5, 12345 Kiel from address book.
```