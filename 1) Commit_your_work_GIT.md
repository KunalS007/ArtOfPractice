1\) First change the directory

in you system where your project is located. C,E,D drive

if not then you have to give the command like

command: cd project path



2\)  

command: git init



3\) 

command: git add .



4\) 

command: git commit -m "initial commit -selenium 2026"



5\) 

command: git branch -M main



6\) 

command: git remote add origin \[copy path from GitHub of repository: https://github.com/KunalS007/feb-2026.git]



7\)

command: git push -u origin main



8\)

command: git status





Simple Explanation:-



Think of Git = a camera that takes snapshots of your project,

and GitHub = an online cupboard where you store those snapshots.



1️⃣ git init

What it does:



👉 Starts Git tracking for your project



It creates a hidden folder: .git



Git now knows: “I have to watch this folder”



Simple example:



🧠 “From now on, remember every change in this project.”



2️⃣ git add .

What it does:



👉 Selects files to be included in the next snapshot (commit)



. means all files \& folders



Moves files to staging area



Simple example:



📸 “These are the files I want to take a photo of.”



⚠️ Without this → Git doesn’t know what to commit



3️⃣ git commit -m "initial commit - selenium-2026"

What it does:



👉 Takes a snapshot of the staged files



Saves current state permanently



Message explains what this snapshot is about



Simple example:



🧾 “Save this version with label: Initial Selenium Framework”



📌 This is your first saved version



4️⃣ git branch -M main

What it does:



👉 Renames your branch to main



Old Git used master



New standard is main



Simple example:



🌿 “Rename my main work line to main.”



💡 Required before pushing to GitHub



5️⃣ git remote add origin <GitHub-URL>

What it does:



👉 Connects your local project to GitHub



origin = nickname of GitHub repository



Tells Git: “This is where my code should go online”



Simple example:



🔗 “Link my laptop project to my GitHub repo.”



6️⃣ git push -u origin main

What it does:



👉 Uploads your code to GitHub



push = send code



origin = GitHub



main = branch name



-u = remember this link for future pushes



Simple example:



☁️ “Upload my project to GitHub and remember this connection.”



After this, next time you only need:



git push



7️⃣ git status

What it does:



👉 Shows current Git situation



It tells you:



Which files changed



Which files are staged



What’s committed or not



Simple example:



🧠 “Tell me what’s going on with my project right now.”





git init        → Start Git

git add .       → Select files

git commit      → Save snapshot

git branch -M   → Set main branch

git remote add  → Connect GitHub

git push        → Upload code

git status      → Check condition







==================================================================================================================

&nbsp;						**If I want to pull**

==================================================================================================================



1\) cd change the location of project 

2\) git branch \[it display \*main or other]

3\) git pull origin main





Command	Meaning  - Interview questions

git clone	First-time download

git pull	Update existing project

git fetch	Download changes only

git pull	fetch + merge



