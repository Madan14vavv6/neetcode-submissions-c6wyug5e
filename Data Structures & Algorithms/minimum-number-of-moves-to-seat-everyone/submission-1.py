class Solution:
    def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
        seats.sort()
        students.sort()
        minRequirement = 0
        for i in range(0, len(seats)):
            minRequirement += abs(seats[i] - students[i])
        return minRequirement;