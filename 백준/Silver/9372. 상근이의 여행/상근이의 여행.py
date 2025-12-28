import sys

input = sys.stdin.readline


def solution():
    T = int(input())

    for _ in range(T):
        N, M = map(int, input().split())

        for _ in range(M):
            input()
        print(N - 1)


if __name__ == "__main__":
    solution()