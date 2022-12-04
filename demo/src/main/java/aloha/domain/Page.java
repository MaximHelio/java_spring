package aloha.domain;

import lombok.Data;

@Data
public class Page {
    private static final int PAGE_NUM = 1;
    private static final int ROWS_PER_PAGE = 10;
    private static final int PAGE_COUNT = 10;
    private int pageNum;        // 현재 페이지 번호
    private int rowsPerPage;    // 페이지 당 게시물 수 => 0으로 조회됨
    private int pageCount;      // 노출 페이지 개수
    private int totalCount;     // 전체 데이터 개수

    private int startPage;      // 시작 페이지 번호
    private int endPage;        // 끝 페이지 번호

    private int firstPage;      // 첫번째 페이지 번호
    private int lastPage;       // 마지막 페이지 번호
    private int prev;           // 이전 페이지 번호
    private int next;           // 다음 페이지 번호

    private int startRowIndex;  // 시작 데이터 index

    // 생성자
    public Page() {
//        this.pageNum = PAGE_NUM;
//        this.rowsPerPage = ROWS_PER_PAGE;
//        this.pageCount = PAGE_COUNT;
        this( PAGE_NUM, ROWS_PER_PAGE, PAGE_COUNT, 0);
    }
    //
    public Page(int totalCount){
//        this.pageNum = PAGE_NUM;
//        this.rowsPerPage = ROWS_PER_PAGE;
//        this.pageCount = PAGE_COUNT;
//        this.totalCount = totalCount;
        this( PAGE_NUM, ROWS_PER_PAGE, PAGE_COUNT, totalCount);
    }
    public Page(int pageNum, int totalCount){
//        this.pageNum = pageNum;
//        this.rowsPerPage = ROWS_PER_PAGE;
//        this.pageCount = PAGE_COUNT;
//        this.totalCount = totalCount;
        this(pageNum, ROWS_PER_PAGE, PAGE_COUNT, totalCount);
    }
    public Page(int pageNum, int rowsPerPage, int pageCount, int totalCount){
        this.pageNum = pageNum;
        this.rowsPerPage = rowsPerPage;
        this.pageCount = pageCount;
        this.totalCount = totalCount;

        this.prev = pageNum - 1;
        this.next = pageNum + 1;

        this.firstPage = 1;
        // (전체 데이터 개수 -1) / 페이지 당 게시물 수 + 1
        this.lastPage = (totalCount-1) / rowsPerPage + 1;
        // ((현재 페이지 번호-1) / 노출페이지 수) * 노출페이지 개수 + 1
        this.startPage = ((pageNum-1) / pageCount) * pageCount + 1;
        // ((현재 페이지 번호-1)/ 노출 페이지 개수 + 1) * 노출페이지 개수
        this.endPage = ((pageNum-1) / pageCount + 1) * pageCount;

        // 끝 페이지가 마지막 페이지 보다 클 때, 실제 데이터 개수를 반영한 끝페이지로 보정
        if( this.lastPage > 1 && this.endPage > this.lastPage ) {
            this.endPage = this.lastPage;
        }
        this.startRowIndex = ( pageNum-1 ) * rowsPerPage;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        // totalCount 변경 시, lastPage 다시 계산
        this.lastPage = (totalCount-1) / rowsPerPage + 1;
    }
}
