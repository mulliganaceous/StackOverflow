def Graderange:
    def __init__(self, grade:str, mingrade:int, maxgrade:int):
        self.grade = grade
        self.mingrade = mingrade
        self.maxgrade = maxgrade

g12 = Graderange("A+", 95, 100)
g11 = GradeRange("A", 90, 97)
g10 = GradeRange("A-", 85, 93)
g09 = GradeRange("B+", 80, 88)
g08 = GradeRange("B", 75, 85)
g07 = GradeRange("B-", 70, 78)
g06 = GradeRange("C+", 65, 74)
g05 = GradeRange("C", 60, 72)
g04 = GradeRange("C-", 55, 69)
g03 = GradeRange("D+", 50, 66)
g02 = GradeRange("D", 45, 63)
g01 = GradeRange("D-", 40, 59)
g00 = GradeRange("E", 20, 55)
gf1 = GradeRange("F", 1, 50)
gf2 = GradeRange("F-", 0, 0)
