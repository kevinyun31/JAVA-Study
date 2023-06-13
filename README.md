# Git 명령어

## Git 로컬 컴퓨터에서 사용자 등록하기

- git config --global user.name "rkawkclsrn"
- git config --global user.email "rkawkclsrn@naver.com"

## Git 시작하기

- git init
- git add .
- git commit -m "JAVA Study 23.06.08" <-- commit 뒤에 " " 안의 제목은 바꿔쓰도록.

## Github 업로드하기

- git remote add origin https://github.com/rkawkclsrn/JAVA-Study.git
  origin을 origtin 으로 오타냄 - remove -rm
- git push origin master

## 다시 업로드 법

- 소스코드 변경
- git add .
- git commit -m "변경내용 적고"
- git push origin master

## 잘 안될때 해결법

- git remote -v
- git remote rm origin

## Github 소스코드 다운로드 하는법

- git clone "Github에서 파일 주소복사"
  붙여넣을 폴더를 비워놓고 우클릭으로 git bash here누른 후 입력
