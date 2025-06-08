def solution(numbers):
    str_numbers = list(map(str, numbers))
    str_numbers.sort(key=lambda x: x*10, reverse=True)

    answer = ''.join(str_numbers)
    
    # 모두 0이면 
    if answer[0] == '0':
        return '0'
    
    return answer
