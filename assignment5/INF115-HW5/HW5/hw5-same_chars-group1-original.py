def check_if_last_char_is_a_letter(txt):
    if not txt:
        return False
    
    txt = txt.strip()
    if not txt:
        return False

    last_char = txt[-1]
    
    if 'a' <= last_char <= 'z' or 'A' <= last_char <= 'Z':
        words = txt.split()
        if last_char == words[-1][-1]:
            return True
        else:
            return False
    else:
        return False

