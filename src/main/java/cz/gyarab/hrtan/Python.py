import re
map: dict = {}
values: list[str]
with open("wilderness.txt") as file:
    values = re.split(r"\s+", file.read())

best = None
for value in values:
    try:
        map[value] += 1
        if map[value] > map[best]:
            best = value
    except KeyError:
        map[value] = 1
        if best is None:
            best = value
        continue

print(f"Number {best} is appearing {map[best]} times.")
