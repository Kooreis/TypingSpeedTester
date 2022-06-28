def typing_speed(input_text, start_time, end_time):
    words_per_minute = len(input_text.split()) / 5.0
    time_diff = end_time - start_time
    speed = words_per_minute / time_diff * 60
    return speed