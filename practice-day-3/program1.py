"""
Represent a small bilingual (English-Swedish) glossary given
 below as a Python  dictionary
{"merry":"god", "christmas":"jul", "and":"och", "happy":"gott", 
"new":"nytt", "year":"ar"}
and use it to translate your Christmas wishes from English 
into Swedish.
That is, write a python function translate() that accepts the 
bilingual dictionary and a  list of English words (your 
Christmas wish) and returns a list of equivalent Swedish 
 words.

Input 			         Output
["merry","christmas"]		["god" ,"jul"]
["happy","new","year"]          ["gott","nytt","ar"]
"""



def translate(words):
    dict = {"merry":"god", "christmas":"jul", "and":"och", "happy":"gott", "new":"nytt", "year":"ar"}
    swedish = []
    for word in words:
        swedish.append(dict[word])
    return swedish

print(translate(["merry","christmas"]))
