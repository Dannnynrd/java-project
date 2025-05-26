Git & GitHub Kurz-Tutorial für Zusammenarbeit im Terminal
==========================================================

🔧 Voraussetzungen:
- Git installiert: `git --version`
- GitHub-Konto + Repository-Zugriff
- Optional: SSH-Key (sonst HTTPS)

----------------------------------------------------------
1. Repository klonen (Projekt herunterladen)
----------------------------------------------------------
git clone https://github.com/USERNAME/REPOSITORY.git
cd REPOSITORY

----------------------------------------------------------
2. Eigene Änderungen machen
----------------------------------------------------------
# Dateien ändern/erstellen
git status
git add .
git commit -m "Neue Funktion XY hinzugefügt"

----------------------------------------------------------
3. Änderungen vom Team holen (bevor du pushst)
----------------------------------------------------------
git pull origin main

# Bei Konflikten:
# - Konflikte manuell lösen
# - Dann:
git add .
git commit -m "Konflikt gelöst"

----------------------------------------------------------
4. Änderungen hochladen (pushen)
----------------------------------------------------------
git push origin main

----------------------------------------------------------
5. Optional: Mit Branches arbeiten (für größere Features)
----------------------------------------------------------
git checkout -b feature-xyz     # Neuen Branch erstellen
# Code ändern
git add .
git commit -m "Feature xyz"
git push origin feature-xyz     # Branch hochladen

# Dann auf GitHub:
# Pull Request erstellen → Review → Merge in `main`

----------------------------------------------------------
✅ Best Practices:
----------------------------------------------------------
- Vor dem Arbeiten: immer `git pull`
- Regelmäßig committen und pushen
- Am besten mit Branches & Pull Requests arbeiten
"""

# Speichern als .txt Datei
file_path = "/mnt/data/github_kollaboration_tutorial.txt"
with open(file_path, "w") as file:
    file.write(tutorial_text)

file_path
Ergebnis
'/mnt/data/github_kollaboration_tutorial.txt'
