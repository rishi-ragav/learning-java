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



def translate(list_of_words):
    # Dictionary of words
    dictionary = {"merry":"god", "christmas":"jul", "and":"och", "happy":"gott", "new":"nytt", "year":"ar"}
    # List of translated words
    translated_list = []
    # Looping through the list of words
    for word in list_of_words:
        # Appending the translated word to the list
        translated_list.append(dictionary[word])
    # Returning the list of translated words
    return translated_list

# List of words to be translated
list_of_words = ["merry","christmas"]
# Printing the translated list
print(translate(list_of_words))
