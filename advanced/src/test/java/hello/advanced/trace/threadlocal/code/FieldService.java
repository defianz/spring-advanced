package hello.advanced.trace.threadlocal.code;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FieldService {

    private String nameStore;

    public String logic(String name){
        log.info("저장 name={} -> nameStore={}", name, getNameStore());
//        nameStore = name;
        setNameStore(name);
        sleep(1000);
        log.info("조회 nameStore={}", getNameStore());
        return getNameStore();
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getNameStore() {
        return nameStore;
    }
}
