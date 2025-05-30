def check_if_last_char_is_a_letter(txt):
    if not txt:
        return False
    words = txt.split()
    if not words:
        return False
    last_word = words[-1]
    if not last_word:
        return False
    last_char = last_word[-1]
    if 'a' <= last_char <= 'z' or 'A' <= last_char <= 'Z':
        if len(last_word) == 1:
            return True
        else:
            return False
    else:
        return False

