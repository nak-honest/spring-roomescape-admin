# 방탈출 예약 관리

## 기능 요구사항

### 뷰 요구사항

- [X] localhost:8080/admin 에 접속하면 어드민 메인 페이지를 띄운다
- [x] localhost:8080/admin/reservation 에 접속하면 예약 관리 페이지를 띄운다.
- [x] localhost:8080/admin/time 에 접속하면 예약 시간 관리 페이지를 띄운다.
  <br>

### 도메인 요구사항

- [x] 모든 예약을 조회한다.
- [x] id를 기반으로 예약을 조회한다.
- [x] 예약을 저장한다.
- [x] id를 기반으로 예약을 삭제한다.
  <br>

- [x] 모든 예약 시간을 조회한다.
- [x] id를 기반으로 예약 시간을 조회한다.
- [x] 예약 시간을 저장한다.
- [x] id를 기반으로 예약 시간을 삭제한다.
  <br>

- [x] 존재하는 예약 시간에 대해서만 예약을 추가할 수 있다.

### API 요구사항

- [x] 예약 관리 페이지 로드 시 호출되는 예약 목록 조회 API 를 구현한다.
- [x] 예약 추가 API 를 구현한다.
- [x] 예약 삭제 API 를 구현한다.
  <br>

- [x] 예약 시간 관리 페이지 로드 시 호출되는 예약 시간 목록 조회 API를 구현한다.
- [x] 예약 시간 추가 API 를 구현한다.
- [x] 예약 시간 삭제 API 를 구현한다.
