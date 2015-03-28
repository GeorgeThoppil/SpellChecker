Problem: SpellChecker

Implement a spelling checker in any language of your choice, provided the solution can be compiled or interpreted on a typical Linux platform with freely available software (perl, Gnu programming tools, Java 1.6/1.7, python etc.). Implement the solution using your best programming practices. 

Some requirements:
Do not copy an existing solution from the internet, but feel free to use the internet to study the problem. Your code should be your own.
Do not use a library that provides a single function/object that implements a solution to the problem. Otherwise, feel free to use common library functions/objects.
Treat this as if this was a task that was assigned to you as a part of your responsibilities as a member of our team.
Document the code. Keep some notes on how you designed and implemented the application. Be prepared to do a code walkthrough.
Input

The program will accept exactly two mandatory inputs:
The document to be checked: a file containing words composed of printable ASCII text, delimited by whitespace.
The dictionary: a file containing words composed of printable ASCII text, containing exactly one word per line.
Output

The spell checker must output a list of words that were not found in the dictionary.

Example


$ spellcheck Inputfile DictionaryFile
documnt
words
difficlt


Inputfile
This is a test documnt. It contains many, interesting words. Is this a difficlt problem?


DictionaryFile
this
is
a
test
document
it
contains
many
interesting
difficult
problem
