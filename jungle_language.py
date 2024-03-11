# Jungle Language Translator

def translate_sentence(sentence):
    vowels = {'a': '1', 'e': '2', 'i': '3', 'o': '4', 'u': '5'}
    translated = ''
    for letter in sentence:
        if letter.lower() in vowels:
            translated += vowels[letter.lower()]
        elif letter.isalpha():
            translated += letter + 'a'
        else:
            translated += letter
    return translated


sentence = "I wish he told me before hand tho. Now i dont know what to say. If I say no, it'll be like im ungrateful. Maybe i'll just say yes and then sell it"
print(translate_sentence(sentence))
