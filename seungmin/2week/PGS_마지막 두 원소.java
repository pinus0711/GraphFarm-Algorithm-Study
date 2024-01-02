package step00study;

class Solution {
    public int[] solution(int[] num_list) {
        
        // Java에서 배열은 생성 시에 정한 크기만큼 고정.
        // 가변 배열 구현 방법 1. [반복문]
        
        // 순서 1. (원본 배열의 크기 + 1)의 크기를 가지는 배열을 새로 생성
        int[] array = new int[num_list.length + 1];
        
        // 순서 2. 새로운 배열에 기존 배열 값을 반복문으로 순차적 할당
        for (int i=0; i<num_list.length; i++) {
            array[i] = num_list[i];
        }
        
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            
        // 순서 3. 새로운 배열의 마지막 위치에 추가하려는 값을 할당
            array[num_list.length] =
                (num_list[num_list.length-1])
                - (num_list[num_list.length-2]);
        } else {
            array[num_list.length] =
                (num_list[num_list.length-1]) * 2;
        }
        
        // 순서 4. 새로운 배열을 반환
        return array;
        
        
        // 가변 배열 구현 방법 2. [리스트]
        // 순서 1. 배열을 리스트로 변환
        // 순서 2. List의 '.add' 메서드를 호출하여 추가하려는 값을 할당
        // 순서 3. List를 배열로 변환 후 반환
        
    }
}