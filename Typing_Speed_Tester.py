```python
import time

def typing_speed(input_text, start_time, end_time):
    words_per_minute = len(input_text.split()) / 5.0
    time_diff = end_time - start_time
    speed = words_per_minute / time_diff * 60
    return speed

def main():
    input_text = input("Type this: 'The quick brown fox jumps over the lazy dog.'\n")
    start_time = time.time()
    end_time = time.time()
    speed = typing_speed(input_text, start_time, end_time)
    print("Your average typing speed was %s words per minute." % speed)

if __name__ == "__main__":
    main()
```